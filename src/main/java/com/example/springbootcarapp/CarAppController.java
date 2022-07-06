package com.example.springbootcarapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class CarAppController {
    @GetMapping("/status")
    public ResponseEntity <String> name() {
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }


}
