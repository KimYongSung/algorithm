package com.kys.algorithm.codility;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BinaryGapTest {

    @Test
    public void cas01(){

        // given
        int num = 328;

        BinaryGap binaryGap = new BinaryGap();

        // when
        int result = binaryGap.solution(num);

        // then
        assertThat(result).isEqualTo(2);
    }
}
