package com.example.userservice.controller;

import com.example.userservice.dtos.RegisterRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthorizationController {
    @GetMapping("/user-service")
    public String user_service(){
        return "User-service";
    }

    @PostMapping("/login")
    public String login(@RequestBody RegisterRequest dto){
        return dto.getName()+" "+dto.getAge();
    }
}
