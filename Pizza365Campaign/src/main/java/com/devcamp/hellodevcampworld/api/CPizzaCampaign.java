package com.devcamp.hellodevcampworld.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Random;

@RestController
public class CPizzaCampaign {

    @CrossOrigin
    @GetMapping("/devcamp-simple")
    public String simple() {
        return "test campaign";
    }

    @CrossOrigin
    @GetMapping("/devcamp-welcome")
    public String welcome(@RequestParam(required = false, defaultValue = "pizza lover") String name) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        
        String dayString = "";
        switch (dayOfWeek) {
            case MONDAY: dayString = "Thứ Hai"; break;
            case TUESDAY: dayString = "Thứ Ba"; break;
            case WEDNESDAY: dayString = "Thứ Tư"; break;
            case THURSDAY: dayString = "Thứ Năm"; break;
            case FRIDAY: dayString = "Thứ Sáu"; break;
            case SATURDAY: dayString = "Thứ Bảy"; break;
            case SUNDAY: dayString = "Chủ Nhật"; break;
        }

        return "Hello " + name + " ! Hôm nay " + dayString + ", mua 1 tặng 1.";
    }

    @CrossOrigin
    @GetMapping("/lucky-dice")
    public String luckyDice(@RequestParam String username, 
                            @RequestParam(required = false) String firstname, 
                            @RequestParam(required = false) String lastname) {
        Random random = new Random();
        int luckyNumber = random.nextInt(6) + 1;
        return "Xin chào: " + username + ", Số may mắn hôm nay của bạn là: " + luckyNumber;
    }
}
