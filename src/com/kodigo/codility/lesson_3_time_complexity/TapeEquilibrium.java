package com.kodigo.codility.lesson_3_time_complexity;

import org.junit.Assert;
import org.junit.Test;


/**
 * Codility Problem Link: https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
public class TapeEquilibrium {

    public static int solution(int[] A) {
        //if(A.length == 2) return Math.abs(A[1] - A[0]);

        int totalSum = 0;

        for(int num: A) totalSum+= num;

        int leftSum = A[0];
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++) {
            leftSum += A[i];
            totalSum = A[i] - totalSum;
            minDiff = Math.min(minDiff, Math.abs(totalSum-leftSum));
        }

        return minDiff;
    }

    public static int solution2(int[] A) {
        int len = A.length;

        if(len==2) {
            return Math.abs((A[0]-A[1]));
        }
        double sum = 0;
        for(int val : A) {
            sum = sum+val;
        }
        double leftSum = 0, difference = 0, minimum = Integer.MAX_VALUE;

        for(int i=0; i<len-1; i++) {
            leftSum = leftSum + A[i];
            difference = sum - 2*leftSum;

            minimum = Math.min(Math.abs(difference), minimum);
        }
        return (int) minimum;
    }

    @Test
    public void testSolution() {
        Assert.assertEquals(20, solution2(new int[]{-10, -20, -30, -40, 100}));
        Assert.assertEquals(2000, solution2(new int[]{-1000,1000}));

        /*Assert.assertEquals(2000, solution(new int[]{-1000, 1000}));
        Assert.assertEquals(1, solution(new int[]{3,1,2,4,3}));
        Assert.assertEquals(2, solution(new int[]{1,3}));
        Assert.assertEquals(20, solution(new int[]{0,20}));
        Assert.assertEquals(20, solution(new int[]{20,20}));
        Assert.assertEquals(2, solution(new int[]{1,1,2,2}));*/
    }

}
