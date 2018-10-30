package com.example.demosecurityjwt.controller;

import com.example.demosecurityjwt.model.JwtUser;
import com.example.demosecurityjwt.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser){
//        JwtGenerator jwtGenerator = new JwtGenerator();
//        jwtGenerator.generate(jwtUser);

        return jwtGenerator.generate(jwtUser);
    }

}
