package com.kodigo.codility.lesson_2_arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 *   A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

     The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

     Write a function:

     class Solution { public int[] solution(int[] A, int K); }

     that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

     For example, given

     A = [3, 8, 9, 7, 6]
     K = 3
     the function should return [9, 7, 6, 3, 8]. Three rotations were made:

     [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
     [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
     [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
     For another example, given

     A = [0, 0, 0]
     K = 1
     the function should return [0, 0, 0]

     Given

     A = [1, 2, 3, 4]
     K = 4
     the function should return [1, 2, 3, 4]

     Assume that:

     N and K are integers within the range [0..100];
     each element of array A is an integer within the range [−1,000..1,000].
 */
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
