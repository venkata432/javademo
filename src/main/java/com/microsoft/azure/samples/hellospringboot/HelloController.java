package com.azure.test.demoazuredevops;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/Greetings")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
