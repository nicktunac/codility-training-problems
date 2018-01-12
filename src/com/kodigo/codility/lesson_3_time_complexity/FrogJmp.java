package com.kodigo.codility.lesson_3_time_complexity;

import org.junit.Assert;
import org.junit.Test;

public class FrogJmp {



    public static int solution(int X, int Y, int D) {

        if(X >= Y || D == 0) return 0;
        if(D >= Y) return 1;

        return (Y-X) % D == 0 ? (Y-X) / D : (Y-X) / D +1;
    }


    @Test
    public void testFrogJmp() {

        Assert.assertEquals(2,solution(10,70,30));
        Assert.assertEquals(3,solution(10,75,30));
        Assert.assertEquals(3,solution(10,85,30));
        Assert.assertEquals(9, solution(1,10,1));

    }

}
