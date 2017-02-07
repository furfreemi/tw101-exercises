package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Larissa on 1/25/2017.
 */
public class GuessGame {

    private RandomNumber rand;
    private boolean guessed = false;

    public GuessGame(RandomNumber rand){
        this.rand = rand;
    }

    // Update game status
    public void checkGuess(int guess){
        if (rand.compareTo(guess) == 0) {
            guessed = true;
        }
    }

    // Print the results of a guess
    // Originally had this merged in with checkGuess but seemed like checkGuess was doing two things (updating game results and printing out)
    public void printResults(int guess){
        if (guessed()){
            System.out.println("Congrats! The number was " + guess + ".");
        } else {
            int result = rand.compareTo(guess);
            if (result < 0){
                System.out.println("Try again- " + guess + " is too high.");
            } else {
                System.out.println("Try again- " + guess + " is too low.");
            }
        }
    }

    // Return if the game has been won yet
    public boolean guessed(){
        return guessed;
    }

}
