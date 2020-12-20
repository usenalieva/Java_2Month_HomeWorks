package com.makhabatusen.classwork.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super.setName(name);
    }

    @Override
    public String draw() {
        return "\uD83D\uDC15";
    }


    @Override
    public String callSound() {
        return "gav gav";
    }
}
