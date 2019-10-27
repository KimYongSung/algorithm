package com.kys.algorithm.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PickingNumbersTest {

    @Test
    public void case01(){

        // given
        List<Integer> input = Arrays.asList(4, 6, 5, 3, 3, 1);

        // when
        int result = PickingNumbers.pickingNumbers(input);

        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void case02(){

        // given
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 1, 2);

        // when
        int result = PickingNumbers.pickingNumbers(input);

        // then
        assertThat(result).isEqualTo(5);
    }
}
