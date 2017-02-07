package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    // Computes sum of odd numbers falling between start and end
    // (inclusive- includes start and end (if odd) in the summation)
    public int of(int start, int end) {
        // Switches endpoints if start falls after end
        if (end < start){
            int temp = end;
            end = start;
            start = temp;
        }

        // If start is even: increment to begin at first odd number; else, begin at start
        int current = (start % 2 == 0) ? start + 1 : start;
        int sum = 0;

        while (current <= end){
            sum += current;
            current += 2;
        }

        return sum;
    }
}
