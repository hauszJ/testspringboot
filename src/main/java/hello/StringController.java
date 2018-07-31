package hello;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StringController {

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public List<String> Hello(){
        List<String> Strings=new ArrayList<>();
        Strings.add("1");
        Strings.add( "2");
        return Strings;
    }

    @GetMapping(value="/testGet/{name}")
    public String getString( @PathVariable("name") String name){
        return "get:"+name;
    }
    @PostMapping(value="/testPost")
    public String postString(@RequestBody String s){
        return "post:"+s;
    }
    @PutMapping(value="/testPut")
    public String putString(@RequestBody String s){
        return "put:"+s;
    }
    @DeleteMapping(value="/testDelete")
    public String deleteString(@RequestParam(value="name") String s){
        return "del:"+s;
    }

}
