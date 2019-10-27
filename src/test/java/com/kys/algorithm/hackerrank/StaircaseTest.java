package com.kys.algorithm.hackerrank;

import org.junit.Test;

public class StaircaseTest {

    @Test
    public void case01(){
        Staircase.staircase(6);
    }

    @Test
    public void case02(){
        System.out.println(Staircase.birthdayCakeCandles(new int[] { 3, 2, 1, 3}));
    }

    @Test
    public void case03(){
        System.out.println(Staircase.birthdayCakeCandles(new int[] { 1,1,1,1,1,1,1}));
    }

}
