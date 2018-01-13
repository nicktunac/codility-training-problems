package com.kodigo.codility.lesson_4_counting_elements;

import org.junit.Assert;
import org.junit.Test;

/**
 * Link Problem: https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
public class FrogRiverOne {

    public int solution (int X, int[] A) {
        int steps = X;

        boolean leaves[] = new boolean[X+1];

        for(int i = 0; i<A.length; i++) {
            if(!leaves[A[i]]) {
                leaves[A[i]] = true;
                steps--;
            }
            if(steps == 0) return i;
        }

        return -1;
    }

    @Test
    public void testSolution() {
        Assert.assertEquals(6, solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }
}
