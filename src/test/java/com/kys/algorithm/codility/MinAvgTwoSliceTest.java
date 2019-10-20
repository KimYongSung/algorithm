package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinAvgTwoSliceTest {

    @Test
    public void case01(){
        // given
        int[] A = {4, 2, 2, 5, 1, 5, 8};

        // when
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        int result = minAvgTwoSlice.solution(A);

        // then
        assertThat(result).isEqualTo(1);
    }
}
