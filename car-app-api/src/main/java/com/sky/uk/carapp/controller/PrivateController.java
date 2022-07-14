package com.sky.uk.carapp.controller;

import com.sky.uk.carapp.service.GenerateHeaderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
@RequiredArgsConstructor
public class PrivateController {


    private final GenerateHeaderService generateHeaderService;

    //Used Lombok with @RequiredArgsConstructor
//    public PrivateController(GenerateHeaderService generateHeaderService) {
//        this.generateHeaderService = generateHeaderService;
//    }

    @GetMapping("/status")
    public ResponseEntity<String> responseEntity() {
        return new ResponseEntity<String>("OK", generateHeaderService.generateRandomHeader(), HttpStatus.OK);
    }
}


