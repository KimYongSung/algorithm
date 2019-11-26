package com.kys.algorithm.sort;

import org.assertj.core.data.Index;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

    @Test
    public void case01(){
        int[] input = {7, 8, 1 , 2 ,5 , 9, 4, 3, 6, 0};

        QuickSort.sort(input);

        assertThat(input).contains(0, Index.atIndex(0))
                        .contains(1, Index.atIndex(1))
                        .contains(2, Index.atIndex(2))
                        .contains(3, Index.atIndex(3))
                        .contains(4, Index.atIndex(4))
                        .contains(5, Index.atIndex(5))
                        .contains(6, Index.atIndex(6))
                        .contains(7, Index.atIndex(7))
                        .contains(8, Index.atIndex(8))
                        .contains(9, Index.atIndex(9));
    }

    @Test
    public void case02(){
        int[] input = {1, 5, 8, 6, 9, 4, 10, 3, 7, 2};

        QuickSort.sort(input);

        assertThat(input).contains(0, Index.atIndex(0))
                        .contains(1, Index.atIndex(1))
                        .contains(2, Index.atIndex(2))
                        .contains(3, Index.atIndex(3))
                        .contains(4, Index.atIndex(4))
                        .contains(5, Index.atIndex(5))
                        .contains(6, Index.atIndex(6))
                        .contains(7, Index.atIndex(7))
                        .contains(8, Index.atIndex(8))
                        .contains(9, Index.atIndex(9));
    }
}
