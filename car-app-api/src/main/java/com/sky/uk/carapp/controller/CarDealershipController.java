package com.sky.uk.carapp.controller;

import com.sky.uk.carapp.model.Car;
import com.sky.uk.carapp.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/dealership/admin/cars")
public class CarDealershipController {

    private final CarService carService;

//    @GetMapping("")
//    public ResponseEntity<List<Car>> getCars(){
//
//    }

    @PostMapping(path = "/addcar")
    public ResponseEntity<Car> saveCar(@RequestBody Car car){
        Car addedCar = carService.addCar(car);
        return new ResponseEntity<Car>(addedCar, HttpStatus.CREATED);
    }

    @PostMapping(path = "/addcars")
    public ResponseEntity<List<Car>> saveCars(@RequestBody List<Car> cars){
        List<Car> addedCars = carService.addListOfCars(cars);
        return new ResponseEntity<List<Car>>(addedCars, HttpStatus.CREATED);
    }

}