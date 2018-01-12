package com.kodigo.codility.lesson_2_arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CyclicRotation {


    public static int[] solution(int[] A, int K) {

        if(K == 0 || K == A.length || A.length == 0) return A;

        int index;

        if(K < A.length) {
            index = A.length - K - 1;
        } else {
            index = A.length - (K % A.length) - 1;
        }

        int[] head = Arrays.copyOfRange(A, index + 1, A.length);
        int[] tail = Arrays.copyOfRange(A, 0, index + 1);

        int[] result = new int[head.length + tail.length];

        System.arraycopy(head,0, result, 0, head.length);
        System.arraycopy(tail,0, result, head.length, tail.length);

        return result;
    }



    @Test
    public void testCyclicRotation() {
        Assert.assertArrayEquals(solution(new int[]{1,2,3}, 0), new int[]{1,2,3});
        Assert.assertArrayEquals(solution(new int[]{1,2,3}, 3), new int[]{1,2,3});
        Assert.assertArrayEquals(solution(new int[]{1,2,3}, 1), new int[]{3,1,2});
        Assert.assertArrayEquals(solution(new int[]{1,2,3}, 4), new int[]{3,1,2});
        Assert.assertArrayEquals(solution(new int[]{1,2,3}, 5), new int[]{2,3,1});
        Assert.assertArrayEquals(solution(new int[]{1,2,3}, 1), new int[]{3,1,2});
        Assert.assertArrayEquals(solution(new int[]{1,2,3,4}, 1), new int[]{4,1,2,3});
        Assert.assertArrayEquals(solution(new int[]{3,8,9,7,6}, 3), new int[]{9,7,6,3,8});
        Assert.assertArrayEquals(solution(new int[]{0,0,0}, 1), new int[]{0,0,0});
        Assert.assertArrayEquals(solution(new int[]{1,2,3,4}, 4), new int[]{1,2,3,4});
    }
}
