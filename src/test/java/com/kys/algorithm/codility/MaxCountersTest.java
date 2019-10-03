package com.kys.algorithm.codility;

import org.assertj.core.data.Index;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxCountersTest {

    @Test
    public void case01(){
        // given
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};

        // when
        MaxCounters maxCounters = new MaxCounters();
        int[] result = maxCounters.solution(N, A);

        // then
        assertThat(result).contains(3, Index.atIndex(0))
                          .contains(2, Index.atIndex(1))
                          .contains(2, Index.atIndex(2))
                          .contains(4, Index.atIndex(3))
                          .contains(2, Index.atIndex(4))
                          ;

    }
}
