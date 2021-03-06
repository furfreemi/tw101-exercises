package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Larissa on 1/24/2017.
 */
public class RandomNumber implements Comparable<Integer> {

    private int value;

    private final int upperLimit = 100;
    private final int lowerLimit = 1;

    public RandomNumber(){
        value = (int)(Math.random() * (upperLimit - lowerLimit + 1)) + lowerLimit;
    }



    @Override
    public int compareTo(Integer i) {
        return value - i;
    }
}
