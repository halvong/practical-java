package com.course.practicaljava.rest.controller;

import com.course.practicaljava.rest.domain.Car;
import com.course.practicaljava.rest.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/car/v1")
public class CarRestController {

    @Autowired
    private CarService carService;

    private Logger log = LoggerFactory.getLogger(CarRestController.class);

    @GetMapping(path="/random", produces = MediaType.APPLICATION_JSON_VALUE)
    public Car Random() {
        return carService.generateCar();
    }

    @PostMapping(path="/echo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String echo(@RequestBody Car car) {
        log.info("The car is " + car);
        return car.toString();
    }

}
