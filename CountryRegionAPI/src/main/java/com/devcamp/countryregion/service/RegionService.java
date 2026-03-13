package com.devcamp.countryregion.service;

import com.devcamp.countryregion.model.Region;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RegionService {
    public ArrayList<Region> getAllRegions() {
        ArrayList<Region> regions = new ArrayList<>();
        regions.add(new Region("HN", "Ha Noi"));
        regions.add(new Region("HCM", "Ho Chi Minh"));
        regions.add(new Region("DN", "Da Nang"));
        regions.add(new Region("LD", "London"));
        regions.add(new Region("MN", "Manchester"));
        regions.add(new Region("TK", "Tokyo"));
        regions.add(new Region("OS", "Osaka"));
        return regions;
    }

    public Region getRegionByCode(String regionCode) {
        for (Region region : getAllRegions()) {
            if (region.getRegionCode().equalsIgnoreCase(regionCode)) {
                return region;
            }
        }
        return null;
    }
}
