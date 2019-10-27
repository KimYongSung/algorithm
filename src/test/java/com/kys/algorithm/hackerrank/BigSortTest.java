package com.kys.algorithm.hackerrank;

import org.assertj.core.data.Index;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BigSortTest {

    @Test
    public void case01(){

        // given
        String[] input = {"8","1","2","100","12303479849857341718340192371","3084193741082937","3084193741082938", "111","200"};

        // when
        String[] result = BigSorting.bigSorting(input);

        // then
        assertThat(result).contains("1", Index.atIndex(0))
                          .contains("2", Index.atIndex(1))
                          .contains("8", Index.atIndex(2))
                          .contains("100", Index.atIndex(3))
                          .contains("111", Index.atIndex(4))
                          .contains("200", Index.atIndex(5))
                          .contains("3084193741082937", Index.atIndex(6))
                          .contains("3084193741082938", Index.atIndex(7))
                          .contains("12303479849857341718340192371", Index.atIndex(8))
        ;
    }
}
