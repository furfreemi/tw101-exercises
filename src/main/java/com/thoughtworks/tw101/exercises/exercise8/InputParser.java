package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by Larissa on 1/24/2017.
 */
public class InputParser {

    private Scanner input;

    public InputParser(Scanner input){
        this.input = input;
    }


    public int getGuess(){
        System.out.print("Enter a guess for the number: ");
        String guess = input.next();
        try {
            return Integer.parseInt(guess);
        } catch (NumberFormatException e){
            System.out.println("Guesses must be integers.");
            return getGuess();
        }

    }

}
