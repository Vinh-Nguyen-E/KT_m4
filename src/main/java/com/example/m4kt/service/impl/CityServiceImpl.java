package com.example.m4kt.service.impl;


import com.example.m4kt.model.City;
import com.example.m4kt.model.Country;
import com.example.m4kt.repository.CityRepository;
import com.example.m4kt.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public void save(City cities) {
        cityRepository.save(cities);
    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public Iterable<City> findAllByCountry(Country country) {
        return cityRepository.findAllByCountry(country);
    }

    @Override
    public Iterable<City> findAllByName(String name) {
        return cityRepository.findAllByName(name);
    }
}
