package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FrogRiverOneTest {

    @Test
    public void case01(){
        // given
        int X = 5;
        int[] param = {1, 3, 1, 4, 2, 3, 5, 4};

        // when
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int result = frogRiverOne.solution(X, param);

        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void case02(){
        // given
        int X = 3;
        int[] param = {1, 3, 1, 3, 2, 1, 3};

        // when
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int result = frogRiverOne.solution(X, param);

        // then
        assertThat(result).isEqualTo(4);
    }
}
