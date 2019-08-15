package mydemo.scheduler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/hi")
    public String sayhi(){
        return "Hi Ravi";
    }
}
