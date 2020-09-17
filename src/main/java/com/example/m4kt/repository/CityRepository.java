package com.example.m4kt.repository;


import com.example.m4kt.model.City;
import com.example.m4kt.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
    Iterable<City> findAllByCountry(Country country);

    Iterable<City> findAllByName(String name);
}
