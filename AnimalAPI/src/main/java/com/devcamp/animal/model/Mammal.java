package com.devcamp.animal.model;

public class Mammal extends Animal {

    public Mammal() {
    }

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mamaml[" + super.toString() + "]";
    }
}
