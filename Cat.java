package com.company;

public class Cat extends Animal {
    private int humanYears = 12;

    public Cat (int age) {
        super(age);
    }

    @Override
    public void humanYears() {
        System.out.println(getAge() * this.humanYears);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau!");
    }
}
