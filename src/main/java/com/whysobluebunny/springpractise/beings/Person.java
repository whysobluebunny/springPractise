package com.whysobluebunny.springpractise.beings;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person() created");
    }

    //    public Person(Pet pet) {
//        System.out.println("Person(pet) created");
//        this.pet = pet;
//    }

    // pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Person: Set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
