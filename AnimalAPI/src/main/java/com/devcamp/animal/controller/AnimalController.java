package com.devcamp.animal.controller;

import com.devcamp.animal.model.Cat;
import com.devcamp.animal.model.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AnimalController {

    @GetMapping("/cats")
    public ArrayList<Cat> getCats() {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Luna"));
        cats.add(new Cat("Milo"));
        cats.add(new Cat("Oliver"));
        
        // Test greets method (console output)
        for (Cat cat : cats) {
            cat.greets();
        }
        
        return cats;
    }

    @GetMapping("/dogs")
    public ArrayList<Dog> getDogs() {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy"));
        dogs.add(new Dog("Max"));
        dogs.add(new Dog("Bella"));
        
        // Test greets method (console output)
        for (Dog dog : dogs) {
            dog.greets();
        }
        
        // Test greets(Dog another)
        if (dogs.size() >= 2) {
            dogs.get(0).greets(dogs.get(1));
        }

        return dogs;
    }
}
