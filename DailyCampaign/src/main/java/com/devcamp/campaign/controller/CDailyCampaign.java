package com.devcamp.campaign.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.DayOfWeek;

@RestController
@CrossOrigin
public class CDailyCampaign {

    @GetMapping("/")
    public String getDailyCampaign() {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        switch (day) {
            case MONDAY:
                return "Thứ hai: Mua 1 tặng 1";
            case TUESDAY:
                return "Thứ ba: Tặng tất cả khách hàng một phần bánh ngọt";
            case WEDNESDAY:
                return "Thứ tư: Giảm giá 50% cho Pizza Hải Sản";
            case THURSDAY:
                return "Thứ năm: Miễn phí vận chuyển cho đơn hàng trên 200k";
            case FRIDAY:
                return "Thứ sáu: Tặng 1 chai Coca-Cola 1.5L cho combo bự";
            case SATURDAY:
                return "Thứ bảy: Giảm 20% cho tất cả các loại Pizza";
            case SUNDAY:
                return "Chủ nhật: Mua Pizza size L tặng ngay khoai tây chiên";
            default:
                return "Chào mừng bạn đến với Pizza 365!";
        }
    }
}
