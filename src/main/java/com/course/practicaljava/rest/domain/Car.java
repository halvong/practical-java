package com.course.practicaljava.rest.domain;

import java.time.LocalDate;
import java.util.List;

public class Car {

    private boolean available;
    private String brand;
    private String color;
    private LocalDate firstReleaseDate;
    private int price;
    private String type;
    private List<String> additionalFeatures;

    public Car() {}

    public Car(String brand, String color, String type) {
        super();
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public List<String> getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(List<String> additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(LocalDate firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
