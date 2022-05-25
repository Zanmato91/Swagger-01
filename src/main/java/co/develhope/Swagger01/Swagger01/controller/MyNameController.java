package co.develhope.Swagger01.Swagger01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {
    @GetMapping("/getName")
    public String getName(){
        return "Alessandro Marinelli";
    }
}
