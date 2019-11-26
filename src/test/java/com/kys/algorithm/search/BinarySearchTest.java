package com.kys.algorithm.search;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {

    @Test
    public void case01(){

        int[] input = {7, 8, 1 , 2 ,5 , 9, 4, 3, 6, 0};

        Arrays.sort(input);

        int index = BinarySearch.search(input, 9);

        assertThat(index).isEqualTo(9);
    }

    @Test
    public void case02(){

        int[] input = {7, 8, 1 , 2 ,5 , 9, 4, 3, 6, 0};

        Arrays.sort(input);

        int index = BinarySearch.whileSearch(input, 9);

        assertThat(index).isEqualTo(9);
    }
}
