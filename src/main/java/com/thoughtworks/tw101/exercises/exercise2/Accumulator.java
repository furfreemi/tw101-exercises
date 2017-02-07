package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int callCount = 0;

    // Maintain amount of times called
    public void increment(){
        callCount++;
    }

    // Print out amount of times increment() was called
    public void total(){
        System.out.println(callCount);
    }




}
