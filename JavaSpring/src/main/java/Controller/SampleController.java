package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class SampleController {

    @GetMapping("/hi")
    public String method1(){
       return "hello";
    }

    @GetMapping("/error")
    public String err(){
        return "err";
    }

}
