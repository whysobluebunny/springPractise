package com.whysobluebunny.springpractise.animals;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow!");
    }
}
