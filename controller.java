package testFramework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class controller {

    @GetMapping("home")
    public String home(){
        return "Hello World";
    }

    @GetMapping("about")
    public HashMap<String, Object> about(){
        HashMap<String, Object> map = new HashMap<>();

        map.put("message", "Hello World");

        return map;

    }
}
