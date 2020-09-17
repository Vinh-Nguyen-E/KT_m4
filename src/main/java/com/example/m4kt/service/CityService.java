package com.example.m4kt.service;


import com.example.m4kt.model.City;
import com.example.m4kt.model.Country;

public interface CityService {
    Iterable<City> findAll();

    City findById(Long id);

    void save(City cities);

    void remove(Long id);

    Iterable<City> findAllByCountry(Country country);

    Iterable<City> findAllByName(String name);
}
