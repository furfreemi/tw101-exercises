package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Larissa on 1/24/2017.
 */
public class InputParser {

    private Scanner input;

    public InputParser(Scanner input){
        this.input = input;
    }

    // Uses scanner functions to check if valid guess was entered
    public int getGuess(){
        System.out.print("Enter a guess for the number: ");
        if (input.hasNextInt()) {
            return input.nextInt();
        } else {
            input.next();
            System.out.println("Guesses must be integer values.");
            return getGuess();
        }
    }

}
