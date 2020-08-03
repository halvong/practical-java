package com.course.practicaljava.rest.service;

import com.course.practicaljava.rest.domain.Car;

import java.util.List;

public interface CarService {

    List<String> BRANDS = List.of("Toyota","Honda","Ford");
    List<String> COLORS = List.of("Red","Black","White");
    List<String> TYPES = List.of("Sedan","SUV","MPV");
    List<String> ADDITIONAL_FEATURES = List.of("GPS","Alarm","Sunroof","Media player","Leather seats");

    Car generateCar();
}
