package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/wiston")
    public String getHola() {
        return "Hola Wiston!";
    }

    @RequestMapping("/personas")
    public String getNombre(@RequestParam(value="id", defaultValue="1") String id) {
        return "Hola me llamo " + id;
    }
}