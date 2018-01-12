package com.kodigo.codility.lesson_4_counting_elements;

import org.junit.Assert;
import org.junit.Test;

public class EqualizationSteps {

    public static int equlization_steps(int a[], int N) {

        if(a.length == 0) return -1;

        double total = 0;

        for(int num: a) {
            total += num;
        }

        int average = (int)Math.round(total / a.length);

        int count = Math.abs(Math.abs(a[0]) - average);

        for(int i = 1; i < a.length; i++) {
            if(Math.abs(Math.abs(a[i]) - average) != count) return -1;
        }

        return count - 1;
    }

    @Test
    public void testEqualizationSteps() {
        Assert.assertEquals(equlization_steps(new int[]{11,3,7,1}, 5),5);
    }
}
