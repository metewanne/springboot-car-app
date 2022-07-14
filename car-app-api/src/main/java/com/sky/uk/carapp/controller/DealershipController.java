package com.sky.uk.carapp.controller;

import com.sky.uk.carapp.model.CarModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealership/admin/cars")
public class DealershipController {

    @PostMapping("/")
    public ResponseEntity<CarModel> addCarToDB() {
        return addCarToDB();
    }


}