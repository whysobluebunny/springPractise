package com.whysobluebunny.springpractise.beings;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
