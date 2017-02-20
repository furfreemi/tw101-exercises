package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    // (inclusive- includes start and end (if odd) in the summation)
    public int of(int start, int end) {
        if (end < start){
            int temp = end;
            end = start;
            start = temp;
        }

        int current = (start % 2 == 0) ? start + 1 : start;
        int sum = 0;

        while (current <= end){
            sum += current;
            current += 2;
        }

        return sum;
    }
}
