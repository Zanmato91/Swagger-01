package co.develhope.Swagger01.Swagger01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public String getMsg(){
        return "To more info visit: http://localhost:1234/swagger-ui";
    }
}
