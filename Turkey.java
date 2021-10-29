package com.company;

public class Turkey extends Animal{
    private int humanYears = 5;

    public Turkey(int age) {
        super(age);
    }

    @Override
    public void humanYears() {
        System.out.println(getAge() * this.humanYears);
    }

    @Override
    public void makeNoise() {
        int max = 1;
        int random = (int) (Math.random() * (max + 1));
        if(random == 0) {
            System.err.println("*TurkeyNoise.exe has stopped working*");
        } else {
            System.out.println("Gluglugluglu!");
        }
    }
}