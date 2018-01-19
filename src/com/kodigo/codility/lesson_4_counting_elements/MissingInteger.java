package com.kodigo.codility.lesson_4_counting_elements;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Codility Link: https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */
public class MissingInteger {

    public int solution(int[] A){
        int[] uniquePositiveInt = Arrays.stream(A).filter(x -> x > 0).sorted().distinct().toArray();

        int smallestPositiveInt = 1;
        for(int i = 0; i < uniquePositiveInt.length; i++) {
            if(uniquePositiveInt[i] == smallestPositiveInt) {
                smallestPositiveInt++;
            } else {
                return smallestPositiveInt;
            }
        }

        return smallestPositiveInt;
    }

    public int solution2(int[] A){

        HashSet<Integer> uniqueInteger = new HashSet<>();

        for(int i = 0; i < A.length; i++) {
            uniqueInteger.add(A[i]);
        }

        int minimumInt = 1;
        while(uniqueInteger.contains(minimumInt)) {
            minimumInt++;
        }

        return  minimumInt;
    }


    @Test
    public void testSolution(){
        Assert.assertEquals(5, solution2(new int[]{1, 3, 6, 4, 1, 2, -5}));
        Assert.assertEquals(4, solution2(new int[]{1,2,3}));
        Assert.assertEquals(1, solution2(new int[]{-1,3}));
        Assert.assertEquals(1, solution2(new int[]{}));
    }


}
