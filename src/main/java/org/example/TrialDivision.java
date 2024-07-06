package org.example;

import java.util.ArrayList;
import java.util.List;

// Accept some input integer n. For each integer x from {2 ... sqrt(n)} check if x divides n. If you found a
// divisor then n is composite OR ELSE n is prime. Repeated application of trial division to obtain the complete prime
// factorization of a number is called direct search factorization.

//Trial division up to the square root of N works because of the fundamental theorem of arithmetic, which states that
// every integer greater than 1 either is a prime number itself or can be factorized into
// a unique product of prime numbers.

public class TrialDivision {
    public static List<Integer> trialDivisionMethod(int number) {
        List<Integer> factors = new ArrayList<>();

        //Handle divisibility by 2
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        //Check odd divisors starting from 3
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        //If number is a prime number greater than 2
        if (number > 2) {
            factors.add(number);
        }
        return factors;
    }

    public static void main(String[] args) {
        int number = 6789;
        List<Integer> listPrimeFactors = trialDivisionMethod(number);
        System.out.println("Prime factors of " + number + ": " + listPrimeFactors);
    }
}
