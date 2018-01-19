package com.kodigo.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode Link: https://leetcode.com/problems/two-sum/description/
 */

public class TwoSum {

    /**
     * n^2 implementation of two sum
     * @param nums
     * @param target
     * @return
     */
    public int[] solution1(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            int diff = target - nums[i];
            for(int j = i + 1 ; j < nums.length; i++) {
                if(nums[j] == diff) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    @Test
    public void testSolution(){
        Assert.assertArrayEquals(new int[]{0,1}, solution1(new int[]{2,7,11,15}, 9));
        Assert.assertArrayEquals(new int[]{0,1}, solution1(new int[]{3,3}, 6));
    }






}
