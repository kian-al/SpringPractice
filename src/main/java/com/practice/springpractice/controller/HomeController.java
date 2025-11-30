package com.practice.springpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController //for write rest API in SpringBoot
@RequestMapping("/Home") //for all of API start by /Home url
public class HomeController {

    @GetMapping("/index")
     public String home(){    //end point
         return """
                 <h1>hello world </h1>
                 """;
     }
     @GetMapping("/home")
    public String Home(){     //end point
        return """
                 <h1>Wellcome</h1>
        """;
     }
    @GetMapping("/sum/{number1}/{number2}")
    public String sum(@PathVariable Long number1,@PathVariable Long number2){
        return String.valueOf(number1+number2);
    }


}
