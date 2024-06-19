package com.whysobluebunny.springpractise.beings;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

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

    public void setSurname(String surname) {
        System.out.println("Person: Set surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Person: Set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
