package com.whysobluebunny.springpractise.animals;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bark!");
    }
}
