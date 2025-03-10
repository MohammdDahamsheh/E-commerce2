package com.Ecomerce.ecomerce.project.controller;

import com.Ecomerce.ecomerce.project.model.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private com.Ecomerce.ecomerce.project.testData testData;
    @GetMapping("/")
    public ResponseEntity<List<test>> get(){
        List<test>l= testData.findAll();


        return new ResponseEntity<>(testData.findAll(),HttpStatus.OK);
    }
}
