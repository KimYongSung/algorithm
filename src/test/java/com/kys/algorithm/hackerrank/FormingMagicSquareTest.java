package com.kys.algorithm.hackerrank;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FormingMagicSquareTest {

    @Test
    public void case01(){
        // give
        int[][] input = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};

        // when
        int result = FormingMagicSquare.formingMagicSquare(input);

        // then
        assertThat(result).isEqualTo(1);
    }
}
