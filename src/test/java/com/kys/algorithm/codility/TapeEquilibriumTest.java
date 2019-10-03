package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TapeEquilibriumTest {

    @Test
    public void case01(){

        // given
        int[] inputs = {3, 1, 2, 4, 3};

        // when
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(inputs);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case02(){

        // given
        int[] inputs = {4, 5};

        // when
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(inputs);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case03(){

        // given
        int[] inputs = {-1000, 1000};

        // when
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(inputs);

        // then
        assertThat(result).isEqualTo(2000);
    }

    @Test
    public void case04(){

        // given
        int[] inputs = {3, 1, 1};

        // when
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(inputs);

        // then
        assertThat(result).isEqualTo(1);
    }
}
