package com.devcamp.animal.controller;

import com.devcamp.animal.model.Animal;
import com.devcamp.animal.model.Cat;
import com.devcamp.animal.model.Dog;
import com.devcamp.animal.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/cats")
    public ArrayList<Cat> getCats() {
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Animal> allAnimals = animalService.getAllAnimals();
        for (Animal animal : allAnimals) {
            if (animal instanceof Cat) {
                cats.add((Cat) animal);
            }
        }
        return cats;
    }

    @GetMapping("/dogs")
    public ArrayList<Dog> getDogs() {
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Animal> allAnimals = animalService.getAllAnimals();
        for (Animal animal : allAnimals) {
            if (animal instanceof Dog) {
                dogs.add((Dog) animal);
            }
        }
        return dogs;
    }
}
