package com.devcamp.splitstringapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class SplitController {

    @GetMapping("/split")
    public ArrayList<String> splitString(@RequestParam String input) {
        // subTask 3: Cắt chuỗi thành Array String
        String[] wordsArray = input.split("\\s+");

        // subTask 4: Thêm vào ArrayList mới
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordsArray));

        return wordList;
    }
}
