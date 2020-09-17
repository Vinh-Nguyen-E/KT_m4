package com.example.m4kt.repository;


import com.example.m4kt.model.Country;
import org.springframework.data.repository.CrudRepository;
public interface CountryRepository extends CrudRepository<Country, Long> {
}
