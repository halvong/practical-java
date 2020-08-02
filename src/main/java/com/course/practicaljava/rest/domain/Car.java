package com.course.practicaljava.rest.domain;

import java.time.LocalDate;

public class Car {

    private boolean available;
    private String brand;
    private String color;
    private LocalDate firstReleaseDate;
    private int price;
    private String type;

    public Car() {}

    public Car(String brand, String color, String type) {
        super();
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", color=" + color + ", type=" + type + "]";
    }

}
