package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int callCount = 0;


    public void increment(){
        callCount++;
    }


    public void total(){
        System.out.println(callCount);
    }




}
