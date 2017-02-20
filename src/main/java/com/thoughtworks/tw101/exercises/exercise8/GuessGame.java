package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by Larissa on 1/25/2017.
 */

import com.thoughtworks.tw101.exercises.exercise7.RandomNumber;

import java.util.ArrayList;

public class GuessGame {

    private RandomNumber rand;
    private ArrayList<Integer> guessList = new ArrayList<>();
    private boolean guessed = false;

    public GuessGame(RandomNumber rand){
        this.rand = rand;
    }

    public void playGame(InputParser readIn){
        while (!guessed){
            int guess = readIn.getGuess();
            checkGuess(guess);
            printLastGuessResults();
        }
    }

    public void printGuesses(){
        System.out.println("Your guess log:");
        for (int i = 0; i < guessList.size(); i++){
            System.out.println("Guess #" + (i + 1) + ": " + guessList.get(i));
        }
    }


    private void checkGuess(int guess){
        guessList.add(guess);
        if (rand.compareTo(guess) == 0) {
            guessed = true;
        }
    }


    private void printLastGuessResults(){
        if (!guessList.isEmpty()){
            int lastGuess = guessList.get(guessList.size() - 1);
            int result = rand.compareTo(lastGuess);
            if (result == 0) {
                System.out.println("Congrats! The number was " + lastGuess + ".");
            } else if (result < 0){
                System.out.println("Try again- " + lastGuess + " is too high.");
            } else {
                System.out.println("Try again- " + lastGuess + " is too low.");
            }
        }
    }





}
