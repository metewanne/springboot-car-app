package com.sky.uk.carapp.service;

import com.sky.uk.carapp.model.Car;
import com.sky.uk.carapp.repository.CarRepository;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car addCar(Car car){
        return carRepository.save(car);
    }

    public List<Car> addListOfCars(List<Car> cars) {
        return carRepository.saveAll(cars);
    }

}
