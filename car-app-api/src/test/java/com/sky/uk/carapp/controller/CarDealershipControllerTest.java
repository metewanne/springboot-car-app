package com.sky.uk.carapp.controller;

import com.sky.uk.carapp.model.Car;
import com.sky.uk.carapp.service.CarService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarDealershipControllerTest {

    @InjectMocks
    CarDealershipController carDealershipController;

    @Mock
    CarService carService;

    @Test
    public void testResponseBody(){
        Car car = new Car("1", "bmw", "x5", 2020, 500, 4000, "black");
        assertTrue(Objects.requireNonNull(carDealershipController.saveCar(car).getBody()).equals(car));
    }
}
