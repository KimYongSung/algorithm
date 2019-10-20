package com.kys.algorithm.codility;

import org.assertj.core.data.Index;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenomicRangeQueryTest {

    @Test
    public void case01(){

        // given
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};

        // when
        GenomicRangeQuery query = new GenomicRangeQuery();
        int[] results = query.solution(S, P, Q);

        // then
        assertThat(results).contains(2, Index.atIndex(0))
                           .contains(4, Index.atIndex(1))
                           .contains(1, Index.atIndex(2));

    }

    @Test
    public void case02(){

        // given
        String S = "AC";
        int[] P = {0, 0, 1};
        int[] Q = {0, 1, 1};

        // when
        GenomicRangeQuery query = new GenomicRangeQuery();
        int[] results = query.solution(S, P, Q);

        // then
        assertThat(results).contains(1, Index.atIndex(0))
                .contains(1, Index.atIndex(1))
                .contains(2, Index.atIndex(2));

    }
}
