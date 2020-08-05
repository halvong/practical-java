package com.course.practicaljava.rest.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDate;
import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Car {

    private boolean available;
    private String brand;
    private String color;

    @JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/Los_Angeles")
    private LocalDate firstReleaseDate;
    private int price;
    private String type;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private List<String> additionalFeatures;
    private Engine engine;
    private List<Tire> tires;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String secretFeature;

    public Car() {}

    public Car(String brand, String color, String type) {
        super();
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public String getSecretFeature() {
        return secretFeature;
    }

    public void setSecretFeature(String secretFeature) {
        this.secretFeature = secretFeature;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "available=" + available +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", firstReleaseDate=" + firstReleaseDate +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", additionalFeatures=" + additionalFeatures +
                ", engine=" + engine +
                ", tires=" + tires +
                ", secretFeature='" + secretFeature + '\'' +
                '}';
    }

}
