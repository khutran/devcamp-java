package com.devcamp.filterapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class IntegerFilterController {

    private final int[] largerNumbers = {1, 23, 32, 43, 54, 65, 86, 10, 15, 16, 18};

    @GetMapping("/array-int-request-query")
    public ArrayList<Integer> filterArrayByPos(@RequestParam int pos) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : largerNumbers) {
            if (num > pos) {
                result.add(num);
            }
        }
        return result;
    }

    @GetMapping("/array-int-param/{index}")
    public Object getArrayValueByIndex(@PathVariable int index) {
        if (index < 0 || index >= largerNumbers.length) {
            return "";
        }
        return largerNumbers[index];
    }
}
