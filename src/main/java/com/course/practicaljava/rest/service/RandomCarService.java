package com.course.practicaljava.rest.service;

import com.course.practicaljava.rest.domain.Car;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomCarService implements CarService {

    private Random random = new Random();

    @Override
    public Car generateCar() {
        var randomBrand = BRANDS.get(random.nextInt(BRANDS.size()));
        var randomColor = COLORS.get(random.nextInt(BRANDS.size()));
        var randomType = TYPES.get(random.nextInt(BRANDS.size()));

        var car = new Car(randomBrand, randomColor, randomType);

        return car;
    }

}
