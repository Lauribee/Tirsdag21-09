package com.company;

import java.util.Random;

public class Dice {

    private int faceValue;

    //constructor
    public Dice(int i) {

    }


    public void roll() {
        Random randomGenerator = new Random();
        faceValue = randomGenerator.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

}
