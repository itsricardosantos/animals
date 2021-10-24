package com.company;

public class Elephant extends Animal{
    private double humanYears = 1.5;

    public Elephant(int age) {
        super(age);
    }

    @Override
    public void humanYears() {
        System.out.println(getAge() * this.humanYears);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bahruuuuuuhhhhaaaaa!");
    }
}
