package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MinIntegerTest {

    @Test
    public void case01(){
        MinInteger minInteger = new MinInteger();

        int result = minInteger.solution(new int[] {1, 3, 6, 4, 1, 2});

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void case02(){
        MinInteger minInteger = new MinInteger();

        int result = minInteger.solution(new int[] {2});

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case05_single_input_2(){
        MinInteger minInteger = new MinInteger();

        int result = minInteger.solution(new int[] {2});

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case06(){
        MinInteger minInteger = new MinInteger();

        int result = minInteger.solution(new int[] {});

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case04(){
        MinInteger minInteger = new MinInteger();

        int result = minInteger.solution(new int[] {1, 2, 3});

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void case03_input_min_max(){
        MinInteger minInteger = new MinInteger();

        int result = minInteger.solution(new int[] {-1000000, 1000000});

        assertThat(result).isEqualTo(1);
    }
}
