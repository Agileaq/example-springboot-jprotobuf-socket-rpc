package personal.arc.example.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by Arc on 26/4/2016.
 */
@RestController
public class HelloWorld {

    @RequestMapping("/")
    String home() {
        Random random = new Random();
        return "Hello World!!!" + random.nextInt();
    }

}
