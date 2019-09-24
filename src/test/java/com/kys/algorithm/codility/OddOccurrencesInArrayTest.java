package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOccurrencesInArrayTest {

    @Test
    public void case01(){

        int[] A = {9 , 3 , 9, 3 ,9 , 7, 9};
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

        int result = oddOccurrencesInArray.solution(A);

        // then
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void case02(){

        int[] A = {9 , 3 , 9, 3 ,9 ,3, 7, 9, 7};
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

        int result = oddOccurrencesInArray.solution(A);

        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void case03(){

        int[] A = {9 , 3 , 9, 3 ,9 , 7, 9};
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

        int result = oddOccurrencesInArray.solutionJava7(A);

        // then
        assertThat(result).isEqualTo(7);
    }
}
