package com.course.practicaljava.rest.controller;

import com.course.practicaljava.rest.domain.Car;
import com.course.practicaljava.rest.repository.CarElasticRepository;
import com.course.practicaljava.rest.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api/car/v1")
public class CarRestController {

    @Autowired
    private CarService carService;

    @Autowired
    private CarElasticRepository carRepository;

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

    @GetMapping(path="/random-cars", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Car> randomCars() {
        log.info("Random-cars initiated.");
        var result = new ArrayList<Car>();

        for(int i = 0; i < ThreadLocalRandom.current().nextInt(1,10); i++) {
            result.add(carService.generateCar());
        }

        return result;
    }

    @GetMapping(value="/count")
    public String countCar() {
        return "There are " + carRepository.count() + " cars.";
    }

    @PostMapping(value="", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveCar(@RequestBody Car car) {
        var id = carRepository.save(car).getId();
        return "Saved with ID " + id + ".";
    }

    @GetMapping(value="/{id}")
    public Car getCar(@PathVariable("id") String carId) {
        return carRepository.findById(carId).orElse(null);
    }

    @PutMapping(value="/{id}")
    public String updateCar(@PathVariable("id") String carId, @RequestBody Car updatedCar) {

        updatedCar.setId(carId);
        var newCar = carRepository.save(updatedCar);

        return "Updated car with ID " + newCar.getId() + ".";
    }

    @GetMapping(value="/find-json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Car> findCarsByBrandAndColor(@RequestBody Car car) {
        return carRepository.findByBrandAndColor(car.getBrand(), car.getColor());
    }

    @GetMapping(value="/cars/{brand}/{color}")
    public List<Car> findCarsByPath(@PathVariable String brand, @PathVariable String color) {
        return carRepository.findByBrandAndColor(brand, color);
    }

    @GetMapping(value="/cars")
    public List<Car> findCarsByParam(@RequestParam String brand, @RequestParam String color) {
        return carRepository.findByBrandAndColor(brand, color);
    }

}
