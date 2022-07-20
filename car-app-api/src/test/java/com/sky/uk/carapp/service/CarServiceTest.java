package com.sky.uk.carapp.service;

import com.sky.uk.carapp.model.Car;
import com.sky.uk.carapp.repository.CarRepository;
import com.sky.uk.carapp.service.CarService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    CarRepository carRepository;
    Car car;
    List<Car> cars;
    CarService carService;

    @BeforeEach
    public void setUp(){
        carService = new CarService(carRepository);
    }

    @Test
    public void testThatCarIsAdded(){
        Car car1 = new Car("1", "bmw", "x5", 2020, 500, 4000, "black");
        when(carRepository.save(Mockito.any(Car.class))).thenAnswer(car -> car.getArguments()[0]);
        carService.addCar(car1);
        assertEquals("1", carService.addCar(car1).getId());
    }

//    @Test
//    public void testThatListOfCarsAdded(){
//        assertTrue(carRepository.(carService.addListOfCars(cars)));
//    }
}
