package com.kodigo.codility.lesson_3_time_complexity;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Problem Link: https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
public class PermMissingElem {


    public static int solution(int[] A) {
        if(A.length == 0) return 1;

        Arrays.sort(A);

        int i = 1;
        for(int num: A) {
            if(num == i) {
                i++;
            } else {
                return i;
            }
        }

        return i;
    }


    @Test
    public void testSolution() {

        Assert.assertEquals(4, solution(new int[]{2,3,1,5}));
        Assert.assertEquals(2, solution(new int[]{1}));
        Assert.assertEquals(1, solution(new int[]{}));
        Assert.assertEquals(5, solution(new int[]{1,2,3,4}));

    }

}
