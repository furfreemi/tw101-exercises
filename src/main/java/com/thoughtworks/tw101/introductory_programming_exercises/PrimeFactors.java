package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {

    private static ArrayList<Integer> knownPrimes = new ArrayList<>();


    // Requires linear buildup of knownPrimes (least -> greater prime numbers)
    private static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }

        int squareRoot = (int)Math.sqrt(n);

        if (!knownPrimes.isEmpty() && squareRoot <= knownPrimes.get(knownPrimes.size() - 1)) {
            int i = 0;
            while (knownPrimes.get(i) <= squareRoot) {
                if (n % knownPrimes.get(i) == 0) {
                    return false;
                }
                i++;
            }
        }
        // Could add in else here to make this function more reusable
        return true;
    }


    private static void appendFactorsFromKnownPrimes(int n, List<Integer> primeFactors){
        int i = 0;

        while (i < knownPrimes.size() && knownPrimes.get(i) <= n / 2) {
            if (n % knownPrimes.get(i) == 0) {
                primeFactors.add(knownPrimes.get(i));
            }
            i++;
        }
    }

    private static void buildUpKnownPrimes(int n){
        int startPrimeSearch = knownPrimes.isEmpty() ? 2 : knownPrimes.get(knownPrimes.size() - 1) + 1;

        for (int i = startPrimeSearch; i <= n / 2; i++) {
            if (isPrime(i)) {
                knownPrimes.add(i);
            }
        }
    }


    private static List<Integer> generate(int n) {
        LinkedList<Integer> primeFactors = new LinkedList<>();

        if (n < 0){
            n = n * -1;
        }

        if (knownPrimes.isEmpty() || knownPrimes.get(knownPrimes.size() - 1) < n / 2){
            buildUpKnownPrimes(n);
        }

        appendFactorsFromKnownPrimes(n, primeFactors);

        if (primeFactors.isEmpty() && isPrime(n)){
            primeFactors.add(n);
        }

        return primeFactors;
    }


    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        //primeFactors = generate(100);
        //primeFactors = generate(67); // check: make sure prime numbers return a list with just that number
        //primeFactors = generate(1); // check: empty list
        for (int i : primeFactors){
            System.out.println(i);
        }

    }
}
