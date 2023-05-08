package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class testController {
    @RequestMapping("/test")
    public String index(){
        return "test";
    }
}
