package com.company;

public class Dog extends Animal{
    private int humanYears = 7;

    public Dog (int age) {
        super(age);
    }

    @Override
    public void humanYears() {
        System.out.println(getAge() * this.humanYears);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}