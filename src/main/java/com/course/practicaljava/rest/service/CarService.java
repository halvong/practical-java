package com.course.practicaljava.rest.service;

import com.course.practicaljava.rest.domain.Car;

import java.util.List;

public interface CarService {

    List<String> BRANDS = List.of("Toyota","Honda","Ford","BMW","Mitsubishi");
    List<String> COLORS = List.of("Red","Black","White","Blue","Silver");
    List<String> TYPES = List.of("Sedan","SUV","MPV","Hatchback","Convertible");
    List<String> ADDITIONAL_FEATURES = List.of("GPS","Alarm","Sunroof","Media player","Leather seats");
    List<String> FUELS = List.of("Gas","Electric","Hybrid","Hydrogen");
    List<String> TIRE_MANUFACTURERS = List.of("Goodyear","Bridgestone","Dunlop","Hankook");

    Car generateCar();
}
