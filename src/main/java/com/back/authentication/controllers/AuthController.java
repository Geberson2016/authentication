package com.back.authentication.controllers;

import com.back.authentication.payload.response.MessageResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @PostMapping("/register")
    public MessageResponse registerUser(){

        return new MessageResponse("ok");
    }


}
