package hello; 

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/** 
* StringController Tester. 
* 
* @author <Authors name> 
* @since <pre>Jul 30, 2018</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StringControllerTest {
    @Autowired
    private MockMvc mvc;

@Test
public void testHello() throws Exception { 
//TODO: Test goes here...
    mvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andDo(print());
} 

/** 
* 
* Method: getString(@PathVariable("name") String name) 
* 
*/ 
@Test
public void testGetString() throws Exception { 
//TODO: Test goes here...
    mvc.perform(get("/testGet/2"))
            .andExpect(status().isOk())
            .andDo(print());


} 

/** 
* 
* Method: postString(@RequestBody String s) 
* 
*/ 
@Test
public void testPostString() throws Exception { 
//TODO: Test goes here...
    ObjectMapper mapper = new ObjectMapper();
    mvc.perform(post("/testPost")
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .content(mapper.writeValueAsString("test")))
            .andExpect(status().isOk())
            .andDo(print());

}

/**
* 
* Method: putString(@RequestBody String s) 
* 
*/ 
@Test
public void testPutString() throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    mvc.perform(put("/testPut")
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .content(mapper.writeValueAsString("test")))
            .andExpect(status().isOk())
            .andDo(print());
}

/** 
* 
* Method: deleteString(@RequestParam(value="name") String s) 
* 
*/ 
@Test
public void testDeleteString() throws Exception {


    mvc.perform(MockMvcRequestBuilders
            .delete("/testDelete")
            .param("name","test"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(print());


} 


} 
