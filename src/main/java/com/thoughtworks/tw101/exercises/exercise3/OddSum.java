package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        // If start is even: increment to begin at first odd number; else, begin at start
        int current = (start % 2 == 0) ? start + 1 : start;
        int sum = 0;

        while (current < end){
            sum += current;
            current += 2;
        }

        return sum;
    }
}
