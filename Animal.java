package com.company;

public abstract class Animal {
    private int age;
    private int humanYears;
    private String noise;

    public Animal(int age) {
        this.age = age;
    }

    public abstract void humanYears();

    public int getAge() {
        return age;
    }

    public abstract void makeNoise();
}
