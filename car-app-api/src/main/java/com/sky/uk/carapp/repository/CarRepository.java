package com.sky.uk.carapp.repository;

import com.sky.uk.carapp.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface CarRepository extends MongoRepository<Car, String> {

    //@Query
}
