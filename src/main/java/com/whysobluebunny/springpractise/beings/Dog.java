package com.whysobluebunny.springpractise.beings;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void say() {
        System.out.println("Bark!");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
