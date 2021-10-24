package com.company;

public class Pig extends Animal{
    private int humanYears = 10;

    public Pig(int age) {
        super(age);
    }

    @Override
    public void humanYears() {
        System.out.println(getAge() * this.humanYears);
    }

    @Override
    public void makeNoise() {
        System.out.println("Oink, oink!");
    }
}
