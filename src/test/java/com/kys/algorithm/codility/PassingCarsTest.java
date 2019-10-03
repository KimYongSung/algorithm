package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassingCarsTest {

    @Test
    public void case03(){

        // given
        int[] param = new int[] {0 , 1, 0, 1, 1};

        // when
        PassingCars passingCars = new PassingCars();
        int result = passingCars.solution(param);

        // then
        assertThat(result).isEqualTo(5);
    }
}
