package com.devcamp.countryregion.controller;

import com.devcamp.countryregion.model.Country;
import com.devcamp.countryregion.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public ArrayList<Country> getCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/country-info")
    public Country getCountryInfo(@RequestParam String countryCode) {
        return countryService.getCountryByCode(countryCode);
    }
}
