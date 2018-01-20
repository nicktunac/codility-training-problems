package com.kodigo.filter_problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilterProblems {


    /**
     * Computes for the nth number of the fibonacci sequence
     * @param num
     * @return Value of the nth fibonacci sequence
     */
    public int fibonacci(int num) {
        if(num <= 0) return 0;
        if(num == 1) return 1;
        else return fibonacci(num-1) + fibonacci(num - 2);
    }

    /**
     * This method returns true if the input num is a prime number
     * @param num
     * @return
     */
    public boolean isPrime(int num) {
        if(num > 2 && num % 2 == 0) return false;

        for(int i = 3; i < Math.sqrt(num); i= i +2) {
            if(num % i == 0) return false;
        }

        return true;
    }

    /**
     *
     */
    public String fizzBuzz(int number) {
        if(number % 15 == 0) return "FizzBuzz";
        else if(number % 3 == 0) return "Fizz";
        else if(number % 5 == 0) return "Buzz";
        return "Not FizzBuzz";
    }


    @Test
    public void testProblems() {
        // 01123 gets the ith number in fibonacci, because fibonacci starts with 0,1
        assertEquals(3, fibonacci(4));
        assertEquals(true, isPrime(2));
        assertEquals(true, isPrime(3));
        assertEquals(false, isPrime(4));
        assertEquals("FizzBuzz", fizzBuzz(15));
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("Not FizzBuzz", fizzBuzz(19));

    }


}
