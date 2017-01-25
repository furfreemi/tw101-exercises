package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Larissa on 1/24/2017.
 */
public class RandomNumber implements Comparable<Integer> {

    private int value;
    private boolean guessed = false;
    private final int upperLimit = 100;
    private final int lowerLimit = 1;


    public RandomNumber(){
        value = (int)(Math.random() * (upperLimit - lowerLimit + 1)) + lowerLimit;
    }


    public void checkGuess(int guess){
        int result = compareTo(guess);
        if (result == 0) {
            System.out.println("Congrats! The number was " + guess + ".");
            guessed = true;
        } else if (result < 0){
            System.out.println("Try again- " + guess + " is too high.");
        } else {
            System.out.println("Try again- " + guess + " is too low.");
        }
    }

    public boolean guessed(){
        return guessed;
    }


    @Override
    public int compareTo(Integer i) {
        return value - i;
    }
}
