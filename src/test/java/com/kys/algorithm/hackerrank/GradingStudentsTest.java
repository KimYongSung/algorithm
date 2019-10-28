package com.kys.algorithm.hackerrank;

import org.assertj.core.data.Index;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradingStudentsTest {

    @Test
    public void case01(){

        //given
        List<Integer> input = Arrays.asList(73, 67, 38, 33);

        //when
        List<Integer> result = GradingStudents.gradingStudents(input);

        //then
        assertThat(result).contains(75, Index.atIndex(0))
                          .contains(67, Index.atIndex(1))
                          .contains(40, Index.atIndex(2))
                          .contains(33, Index.atIndex(3));
    }
}
