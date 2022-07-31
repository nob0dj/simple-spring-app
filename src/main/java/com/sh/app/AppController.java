package com.sh.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String home(){
        return "Hello github, Hello gitlab, Hello all";
    }
}
