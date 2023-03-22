package com.euler.multiples;

/**
 * @author Vel
 * @date 21/03/23 : 07:21
 * Question link : https://projecteuler.net/problem=1
 * Question name : Multiples of 3 or 5
 * Question desc :
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class ThreeFiveMultipleDriver {
    public static void main(String[] args) {
        ThreeFiveMultipleFinder threeFiveMultipleFinder = new ThreeFiveMultipleFinder();
        int sum = threeFiveMultipleFinder.findThreeFiveMultiplesSum(1000);

        System.out.println("Sum is : " + sum);
    }
}

/*
 * Approach :
 * Iterate (natural numbers) from 1 to n - upperLimit will be given
 * Check if the number is a multiple of 3 or 5
 * If yes, add to the sum, else ignore.
 * Once the upperLimit is reached break the loop.
 * Return the sum.
 */
class ThreeFiveMultipleFinder {
    public int findThreeFiveMultiplesSum(int upperLimit){

        int sum = 0;

        for(int loopIndex = 1; loopIndex < upperLimit; loopIndex++){
            if(loopIndex % 3 == 0 || loopIndex % 5 == 0){
                sum += loopIndex;
            }
        }

        return sum;
    }
}