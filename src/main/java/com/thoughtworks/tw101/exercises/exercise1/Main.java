package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {

    public static void main(String[] args) {
        int sum = 0;

        for (int count = 1; count <= 100; count += 2) {   // Could pull out magic numbers
            sum += count;
            System.out.println(count);
        }

        System.out.println(sum);
    }
}
