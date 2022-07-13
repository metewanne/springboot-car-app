package com.sky.uk.carapp.controller;

import com.sky.uk.carapp.model.ViewModel;
import org.springframework.beans.factory.annotation.Autowired;
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
    private final ViewModel viewModel;
    @Autowired
    public AppController(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @GetMapping("/status")
    public ResponseEntity<String> name() {

        return new ResponseEntity<String>("OK", viewModel.generateRandomHeader(), HttpStatus.OK);
    }

}


