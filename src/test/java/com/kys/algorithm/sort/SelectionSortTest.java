package com.kys.algorithm.sort;

import org.assertj.core.data.Index;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

    @Test
    public void selectionSortTest(){

        int[] input = {7, 8, 1 , 2 ,5 , 9, 4, 3, 6, 0};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(input);

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
    public void selectionSort2Test(){

        int[] input = {7, 8, 1 , 2 ,5 , 9, 4, 3, 6, 0};

        SelectionSort2 selectionSort = new SelectionSort2();
        selectionSort.sort(input);

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
