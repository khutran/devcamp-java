package com.devcamp.rainbowrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class RainbowController {

    @GetMapping("/rainbow")
    public ArrayList<String> getRainbow() {
        ArrayList<String> rainbow = new ArrayList<>();
        rainbow.add("red");
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("blue");
        rainbow.add("indigo");
        rainbow.add("violet");
        return rainbow;
    }
}
