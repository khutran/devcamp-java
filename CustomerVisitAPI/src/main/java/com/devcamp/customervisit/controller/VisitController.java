package com.devcamp.customervisit.controller;

import com.devcamp.customervisit.model.Visit;
import com.devcamp.customervisit.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class VisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/visits")
    public ArrayList<Visit> getVisits() {
        return visitService.getAllVisits();
    }
}
