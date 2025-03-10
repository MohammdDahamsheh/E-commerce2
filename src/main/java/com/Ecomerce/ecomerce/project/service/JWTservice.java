package com.Ecomerce.ecomerce.project.service;

import com.Ecomerce.ecomerce.project.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.websocket.Decoder;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Service
public class JWTservice {
    String secretKey="";

    public JWTservice() {
        try {
            KeyGenerator generator=KeyGenerator.getInstance("HmacSHA256");
            SecretKey SK=generator.generateKey();
            secretKey= Base64.getEncoder().encodeToString(SK.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public SecretKey getKey(){
        byte[]key= Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(key);
    }

    public String generateToken(User user){
        Map<String, Objects>claims=new HashMap<>();

        return Jwts
                .builder()
                .claims()
                .add(claims)
                .subject(user.getUserName())
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+60*60*10))
                .and()
                .signWith(getKey())
                .compact();
    }
}
