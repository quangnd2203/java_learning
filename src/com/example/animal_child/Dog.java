package com.example.animal_child;

import com.example.animal.Animal;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}
