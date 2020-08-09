package com.course.practicaljava.rest.repository;

import com.course.practicaljava.rest.domain.Car;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarElasticRepository extends ElasticsearchRepository<Car, String> {

    public List<Car> findByBrandAndColor(String brand, String color);

    //public Page<Car> findByBrandAndColor(String brand, String color, Pageable pageable);
    //public List<Car> findByFirstReleaseDateAfter(LocalDate date);
}
