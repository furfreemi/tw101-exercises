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

    // Maintain prime numbers known thus far: built up linearly
    private static ArrayList<Integer> knownPrimes = new ArrayList<>();

    // Check if a number is prime or not
    // Requires linear buildup of knownPrimes (least -> greater prime numbers)
    // TODO: add in else condition to handle non-linear buildup- not required by current implementation as generate() functions linearly
    private static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        // We only need to check up until the square root, as beyond the square root, any factor x must be a factor such that x * y = n, where y is less than the square root of n
        int squareRoot = (int)Math.sqrt(n);
        // If knownPrimes is built up enough to determine if this number is prime or not
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

    // Generate list of prime factors of n
    private static List<Integer> generate(int n) {
        LinkedList<Integer> primeFactors = new LinkedList<>();
        int startPrimeSearch;

        // If we've already built up our list of known primes
        if (!knownPrimes.isEmpty()) {
            int i = 0;

            // Save all primes that are factors of n
            // Only need to check up to n / 2 as larger numbers cannot be factors except for n itself
            while (i < knownPrimes.size() && knownPrimes.get(i) <= n / 2) {
                if (n % knownPrimes.get(i) == 0) {
                    primeFactors.add(knownPrimes.get(i));
                }
                i++;
            }

            // If we've searched all possible factors and discovered factors (we know n itself isn't prime), we're done!
            if (n / 2 < knownPrimes.get(knownPrimes.size() - 1) && !primeFactors.isEmpty()) {
                return primeFactors;
            }

            // Otherwise, we need to keep looking for factors
            startPrimeSearch = knownPrimes.get(knownPrimes.size() - 1) + 1;
        } else {
            // Base case: knownPrimes is totally empty
            startPrimeSearch = 2;
        }

        // Build up knownPrimes until we've found all possible factors
        for (int i = startPrimeSearch; i <= n / 2; i++) {
            if (isPrime(i)) {
                if (n % i == 0) {
                    primeFactors.add(i);
                }
                knownPrimes.add(i);
            }
        }

        // If we haven't found any prime factors- is this number itself prime?
        // NOTE: doesn't add n to knownPrimes as knownPrimes needs to be built sequentially upwards in order to function, don't want to accidentally skip any prime numbers
        if (primeFactors.isEmpty()){
            if (isPrime(n)){
                primeFactors.add(n);
            }
        }
        return primeFactors;
    }


    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        //primeFactors = generate(100);
        //primeFactors = generate(67); // check: make sure prime numbers return a list with just that number
        for (int i : primeFactors){
            System.out.println(i);
        }

        //for (int i : knownPrimes){
        //    System.out.println(i);
        //}
    }
}
