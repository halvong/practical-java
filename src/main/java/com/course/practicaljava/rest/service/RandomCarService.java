package com.course.practicaljava.rest.service;

import com.course.practicaljava.rest.domain.Car;
import com.course.practicaljava.rest.domain.Engine;
import com.course.practicaljava.rest.domain.Tire;
import com.course.practicaljava.util.RandomDateUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

    private final Random random = new Random();

    @Override
    public Car generateCar() {
        var randomBrand = BRANDS.get(random.nextInt(BRANDS.size()));
        var randomColor = COLORS.get(random.nextInt(BRANDS.size()));
        var randomType = TYPES.get(random.nextInt(BRANDS.size()));

        var available = ThreadLocalRandom.current().nextBoolean();
        var price = ThreadLocalRandom.current().nextInt(5000,12001);
        var firstReleaseDate = RandomDateUtil.generateRandomLocalDate();
        int randomCount = ThreadLocalRandom.current().nextInt(ADDITIONAL_FEATURES.size());
        var additionalFeatures = new ArrayList<String>();

        for (int i = 0; i < randomCount; i++){
            additionalFeatures.add(ADDITIONAL_FEATURES.get(i));
        }

        var fuel = FUELS.get(ThreadLocalRandom.current().nextInt(FUELS.size()));
        var horsePower = ThreadLocalRandom.current().nextInt(100,221);

        var engine = new Engine();
        engine.setFuelType(fuel);
        engine.setHorsePower(horsePower);

        var tires = new ArrayList<Tire>();
        for(int i = 0; i < 3; i++) {
            var tire = new Tire();
            var manufacturer = TIRE_MANUFACTURERS.get(ThreadLocalRandom.current().nextInt(TIRE_MANUFACTURERS.size()));
            var size = ThreadLocalRandom.current().nextInt(15,18);
            var tirePrice = ThreadLocalRandom.current().nextInt(200,401);

            tire.setManufaturer(manufacturer);
            tire.setPrice(tirePrice);
            tire.setSize(size);
            tires.add(tire);
        }

        var secretFeature = ThreadLocalRandom.current().nextBoolean()? "Can fly" : null;

        var result = new Car(randomBrand, randomColor, randomType);
        result.setAvailable(available);
        result.setPrice(price);
        result.setFirstReleaseDate(firstReleaseDate);
        result.setAdditionalFeatures(additionalFeatures);
        result.setEngine(engine);
        result.setTires(tires);
        result.setSecretFeature(secretFeature);

        return result;
    }

}
