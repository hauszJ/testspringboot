package hello;


import org.springframework.beans.factory.annotation.Autowired;

import static sun.misc.Version.print;


/**
 * GreetingController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jul 30, 2018</pre>
 */
@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
@AutoConfigureRestDocs
class GreetingControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGreeting() throws Exception {
//TODO: Test goes here...
        /*this.mvc.perform(get("/greeting").param("name", "Test").accert(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("s.length()").value(2))
                .andDo(document("List-users"));*/

        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Mock")));
    }


} 
