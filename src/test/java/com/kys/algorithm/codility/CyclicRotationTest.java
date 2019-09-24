package com.kys.algorithm.codility;

import org.assertj.core.data.Index;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CyclicRotationTest {

    @Test
    public void case01(){

        // given
        int A[] = {3, 8, 9, 7, 6};
        int K = 3;

        // when
        CyclicRotation cyclicRotation = new CyclicRotation();
        int result[] = cyclicRotation.solution(A,K);

        // then
        assertThat(result).contains(9, Index.atIndex(0))
                          .contains(7, Index.atIndex(1))
                          .contains(6, Index.atIndex(2))
                          .contains(3, Index.atIndex(3))
                          .contains(8, Index.atIndex(4));
    }
}
