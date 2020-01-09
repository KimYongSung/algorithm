package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxProductOfThreeTest {

    @Test
    public void case01(){

        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

        int result = maxProductOfThree.solution(new int[]{ -3, 1, 2, -2, 5, 6});

        assertThat(result).isEqualTo(60);
    }
}
