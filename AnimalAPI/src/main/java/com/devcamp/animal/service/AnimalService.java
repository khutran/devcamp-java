package com.devcamp.animal.service;

import com.devcamp.animal.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnimalService {
    public ArrayList<Animal> getAllAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Kitty"));
        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Mimi"));
        animals.add(new Dog("Max"));
        animals.add(new Cat("Luna"));
        return animals;
    }
}
