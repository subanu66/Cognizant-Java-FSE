package com.cognizant.springlearn.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant.springlearn") // Important!
public class CountryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class, args);
    }
}
