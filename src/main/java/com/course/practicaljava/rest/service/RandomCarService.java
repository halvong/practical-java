package com.course.practicaljava.rest.service;

import com.course.practicaljava.rest.domain.Car;
import com.course.practicaljava.util.RandomDateUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

    private Random random = new Random();

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

        var result = new Car(randomBrand, randomColor, randomType);
        result.setAvailable(available);
        result.setPrice(price);
        result.setFirstReleaseDate(firstReleaseDate);
        result.setAdditionalFeatures(additionalFeatures);

        return result;
    }

}
