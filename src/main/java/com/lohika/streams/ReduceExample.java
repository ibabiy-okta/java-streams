package com.lohika.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Igor Babiy (ibabiy@okta.com)
 */
public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Find sum of all numbers in the list
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.printf("Sum of all numbers is: %d\n", sum);

        // Find sum of only even numbers
        sum = numbers.stream().filter(number -> number % 2 == 0).reduce(0, Integer::sum);
        System.out.printf("Sum of even numbers is: %d\n", sum);

    }
}
