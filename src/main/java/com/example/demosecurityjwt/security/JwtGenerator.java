package com.example.demosecurityjwt.security;

import com.example.demosecurityjwt.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {
    public String generate(JwtUser jwtUser) {
        Claims claim = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claim.put("serId", String.valueOf(jwtUser.getId()));
        claim.put("role", jwtUser.getRole());


        return Jwts.builder().setClaims(claim)
                .signWith(SignatureAlgorithm.HS512, "secret")
                .compact();
    }
}
