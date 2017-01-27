package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by Larissa on 1/25/2017.
 */

import com.thoughtworks.tw101.exercises.exercise7.RandomNumber;

import java.util.ArrayList;

public class GuessGame {

    private RandomNumber rand;
    private ArrayList<Integer> guessList = new ArrayList<>();

    public GuessGame(RandomNumber rand){
        this.rand = rand;
    }

    public boolean checkGuess(int guess){
        guessList.add(guess);
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


    public void printGuesses(){
        System.out.println("Your guess log:");
        for (int i = 0; i < guessList.size(); i++){
            System.out.println("Guess #" + (i + 1) + ": " + guessList.get(i));
        }
    }

}
