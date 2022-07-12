package com.sky.uk.carapp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("/private")

public class AppController {

    @GetMapping("/status")
    public ResponseEntity<String> name() {
        return new ResponseEntity<>("OK",HttpStatus.OK);
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.set("x-sky-request-id", UUID.randomUUID().toString());
//        return new ResponseEntity<String>("Ok", responseHeaders, HttpStatus.OK);
    }
}


