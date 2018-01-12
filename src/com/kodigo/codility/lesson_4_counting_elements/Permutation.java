package com.kodigo.codility.lesson_4_counting_elements;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Codility Problem: https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
 */
public class Permutation {


    public static int solution(int A[]) {
        if(A.length == 0) return 0;

        Arrays.sort(A);

        if(A[0] != 1 || A[A.length - 1] != A.length) return 0;

        for(int i=1; i<=A.length; i++) {
            if(A[i-1] != i) return 0;
        }

        return 1;
    }


    @Test
    public void testSolution() {

        Assert.assertEquals(1, solution(new int[]{4,1,3,2}));
        Assert.assertEquals(0, solution(new int[]{4,1,3}));
        Assert.assertEquals(0, solution(new int[]{}));
        Assert.assertEquals(1, solution(new int[]{1,2}));
        Assert.assertEquals(0, solution(new int[]{3,1}));
        Assert.assertEquals(1, solution(new int[]{2,1}));
        Assert.assertEquals(0, solution(new int[]{1,3}));
        Assert.assertEquals(1, solution(new int[]{1}));
        Assert.assertEquals(0, solution(new int[]{2}));
    }
}
