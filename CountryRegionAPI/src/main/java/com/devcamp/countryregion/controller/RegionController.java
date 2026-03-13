package com.devcamp.countryregion.controller;

import com.devcamp.countryregion.model.Region;
import com.devcamp.countryregion.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/region-info")
    public Region getRegionInfo(@RequestParam String regionCode) {
        return regionService.getRegionByCode(regionCode);
    }
}
