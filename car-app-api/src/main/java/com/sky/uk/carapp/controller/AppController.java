package com.sky.uk.carapp.controller;

import com.sky.uk.carapp.service.GenerateHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class AppController {
    @Autowired
    private final GenerateHeader generateHeader;

    public AppController(GenerateHeader generateHeader) {
        this.generateHeader = generateHeader;
    }
    @GetMapping("/status")
    public ResponseEntity<String> name() {
        return new ResponseEntity<String>("OK", generateHeader.generateRandomHeader(), HttpStatus.OK);
    }

}


