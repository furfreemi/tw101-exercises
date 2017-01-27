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

    private static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }

        int sqrt = (int)Math.sqrt(n);
        int i = 0;
        while (knownPrimes.size() > 0 && knownPrimes.get(i) <= sqrt){
            if (n % knownPrimes.get(i) == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static List<Integer> generate(int n) {
        LinkedList<Integer> primeFactors = new LinkedList<>();

        if (isPrime(n)){
            primeFactors.add(n);
            return primeFactors;
        }

        int startPrimeSearch;
        if (knownPrimes.size() > 0) {
            int i = 0;
            while (i < knownPrimes.size() && knownPrimes.get(i) <= n / 2) {
                if (n % knownPrimes.get(i) == 0) {
                    primeFactors.add(knownPrimes.get(i));
                }
                i++;
            }
            if (n / 2 < knownPrimes.get(knownPrimes.size() - 1)) {
                return primeFactors;
            }
            startPrimeSearch = knownPrimes.get(knownPrimes.size() - 1) + 1;
        } else {
            startPrimeSearch = 2;
        }
        for (int i = startPrimeSearch; i <= n / 2; i++) {
            if (isPrime(i)) {
                if (n % i == 0) {
                    primeFactors.add(i);
                }
                knownPrimes.add(i);
            }
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        //primeFactors = generate(100);
        for (int i : primeFactors){
            System.out.println(i);
        }
    }
}
