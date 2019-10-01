package br.com.rpms.dailycodingproblem.solution;

import java.util.Arrays;

/**
 *
 * This problem was asked by Stripe.
 *
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can contain duplicates and negative numbers as well.
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *
 * You can modify the input array in-place.
 */
public class ProblemNumber4 {

    public int find(int[] array) {

        int sum = 0;
        int squaresSum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("sum = " + sum);
            squaresSum += Math.pow(array[i], 2);
            System.out.println("squaresSum = " + squaresSum);
        }

//        return (sum-k2)^2 + k2^2 = squaresSum;
//        return Math.pow(sum, 2) -2 * k2 + Math.pow(k2, 2) + Math.pow(k2, 2) = squaresSum;
//        return Math.pow(sum, 2) - 2 * k + 2 * k * k = squaresSum;
//        return Math.pow(sum, 2) - 2 * k + 2 * k * k = squaresSum;
        return 0;

//        int result = 0;
//        for (int i = 0; i < max + 1; i++) {
//            if(max < array[i]) {
//                max = array[i];
//            }
//        }
    }
}
