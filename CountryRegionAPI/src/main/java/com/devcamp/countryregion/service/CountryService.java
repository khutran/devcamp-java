package com.devcamp.countryregion.service;

import com.devcamp.countryregion.model.Country;
import com.devcamp.countryregion.model.Region;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CountryService {
    public ArrayList<Country> getAllCountries() {
        ArrayList<Country> countries = new ArrayList<>();
        
        // Country 1: Vietnam
        ArrayList<Region> vnRegions = new ArrayList<>(Arrays.asList(
            new Region("HN", "Ha Noi"),
            new Region("HCM", "Ho Chi Minh"),
            new Region("DN", "Da Nang")
        ));
        countries.add(new Country("VN", "Vietnam", vnRegions));

        // Country 2: UK
        ArrayList<Region> ukRegions = new ArrayList<>(Arrays.asList(
            new Region("LD", "London"),
            new Region("MN", "Manchester")
        ));
        countries.add(new Country("UK", "United Kingdom", ukRegions));

        // Country 3: Japan
        ArrayList<Region> jpRegions = new ArrayList<>(Arrays.asList(
            new Region("TK", "Tokyo"),
            new Region("OS", "Osaka")
        ));
        countries.add(new Country("JP", "Japan", jpRegions));

        // Country 4: United States (56D.20 update)
        ArrayList<Region> usRegions = new ArrayList<>(Arrays.asList(
            new Region("NY", "New York"),
            new Region("CA", "California")
        ));
        countries.add(new Country("US", "United States", usRegions));

        // Country 5: France (56D.20 update)
        ArrayList<Region> frRegions = new ArrayList<>(Arrays.asList(
            new Region("PA", "Paris"),
            new Region("LY", "Lyon")
        ));
        countries.add(new Country("FR", "France", frRegions));

        // Country 6: Germany (56D.20 update)
        ArrayList<Region> deRegions = new ArrayList<>(Arrays.asList(
            new Region("BE", "Berlin"),
            new Region("MU", "Munich")
        ));
        countries.add(new Country("DE", "Germany", deRegions));

        return countries;
    }

    public Country getCountryByCode(String countryCode) {
        for (Country country : getAllCountries()) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return country;
            }
        }
        return null;
    }
}
