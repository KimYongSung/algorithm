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

    @Test
    public void case02(){

        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

        int result = maxProductOfThree.solution(new int[]{ -5, -5, 4, 5});

        assertThat(result).isEqualTo(125);
    }
}
