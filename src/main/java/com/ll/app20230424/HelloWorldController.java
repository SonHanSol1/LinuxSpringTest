package com.ll.app20230424;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

}
