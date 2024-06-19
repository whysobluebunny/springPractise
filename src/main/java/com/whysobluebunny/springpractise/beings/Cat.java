package com.whysobluebunny.springpractise.beings;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat created");
    }

    @Override
    public void say() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
