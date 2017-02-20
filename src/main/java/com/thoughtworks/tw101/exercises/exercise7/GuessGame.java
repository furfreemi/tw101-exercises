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

    public void playGame(InputParser readIn){
        while (!guessed){
            int guess = readIn.getGuess();
            checkGuess(guess);
            printResults(guess);
        }
    }

    private void checkGuess(int guess){
        if (rand.compareTo(guess) == 0) {
            guessed = true;
        }
    }



    private void printResults(int guess){
        if (guessed){
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


}
