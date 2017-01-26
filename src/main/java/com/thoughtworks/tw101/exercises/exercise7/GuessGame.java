package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Larissa on 1/25/2017.
 */
public class GuessGame {

    private RandomNumber rand;

    public GuessGame(RandomNumber rand){
        this.rand = rand;
    }

    public boolean checkGuess(int guess){
        int result = rand.compareTo(guess);
        if (result == 0) {
            System.out.println("Congrats! The number was " + guess + ".");
            return true;
        } else if (result < 0){
            System.out.println("Try again- " + guess + " is too high.");
        } else {
            System.out.println("Try again- " + guess + " is too low.");
        }
        return false;
    }

}
