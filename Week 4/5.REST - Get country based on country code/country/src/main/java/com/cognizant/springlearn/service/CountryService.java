package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import com.cognizant.springlearn.service.exception.CountryNotFoundexception;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) throws CountryNotFoundexception {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countryList", List.class);

        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundexception("Country not found"));
    }
}
