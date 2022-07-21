package com.sky.uk.carapp.service;

import com.sky.uk.carapp.model.Car;
import com.sky.uk.carapp.repository.CarRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    CarRepository carRepository;

    CarService carService;

    @BeforeEach
    public void setUp() {
        carService = new CarService(carRepository);
    }

    @Test
    public void testThatCarIsAdded() {
        Car car1 = new Car("1", "bmw", "x5", 2020, 500, 4000, "black");
        when(carRepository.save(Mockito.any(Car.class))).thenAnswer(car -> car.getArguments()[0]);
        carService.addCar(car1);
        assertEquals("1", carService.addCar(car1).getId());
    }

    @Test
    public void testThatListOfCarsAdded() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("1", "bmw", "x5", 2020, 500, 4000, "black"));
        carList.add(new Car("2", "tesla", "y", 2021, 5765, 44738, "white"));
        carList.add(new Car("3", "ford", "fiesta", 2015, 43749, 4736, "pink"));
        when(carRepository.saveAll(carList)).thenReturn(carList);
        assertEquals(3 , carService.addListOfCars(carList).size());
    }
}

