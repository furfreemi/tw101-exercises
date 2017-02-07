package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import com.thoughtworks.tw101.exercises.exercise7.RandomNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuessGame game = new GuessGame(new RandomNumber());
        InputParser readIn = new InputParser(new Scanner(System.in));
        while (!game.guessed()){
            int guess = readIn.getGuess();
            game.checkGuess(guess);
            game.printLastGuessResults();
        }
        game.printGuesses();
    }
}
