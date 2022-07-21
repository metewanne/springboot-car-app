package com.sky.uk.carapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("cars")
public class Car {

    @Id
    private String id;
    private String brand;
    private String model;
    private int year;
    private int price;
    private int mileage;
    private String colour;

    public Car(String id, String brand, String model, int year, int price, int mileage, String colour) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.colour = colour;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}