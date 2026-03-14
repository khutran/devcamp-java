package com.devcamp.rainbowrequestinput.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RainbowController {

    private final String[] rainbows = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};

    @GetMapping("/rainbow-request-query")
    public ArrayList<String> filterRainbows(
            @RequestParam(value = "filter", required = false, defaultValue = "") String filter) {
        
        ArrayList<String> filteredColors = new ArrayList<>();
        String lowerFilter = filter.toLowerCase();

        for (String color : rainbows) {
            if (color.toLowerCase().contains(lowerFilter)) {
                filteredColors.add(color);
            }
        }
        return filteredColors;
    }

    @GetMapping("/rainbow-request-param/{index}")
    public String getRainbowColorByIndex(@PathVariable("index") int index) {
        if (index < 0 || index >= rainbows.length) {
            return "";
        }
        return rainbows[index];
    }
}
