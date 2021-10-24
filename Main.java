package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat(4);
        Animal dog = new Dog(7);
        Animal dumbo = new Elephant(51);
        Animal peppa = new Pig(2);
        Animal gluglu = new Turkey(2);

        cat.humanYears();
        cat.makeNoise();
        dog.humanYears();
        dog.makeNoise();
        dumbo.humanYears();
        dumbo.makeNoise();
        peppa.humanYears();
        peppa.makeNoise();
        gluglu.humanYears();
        gluglu.makeNoise();
    }
}
