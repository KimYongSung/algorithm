package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void case01(){

        Triangle triangle = new Triangle();

        int result = triangle.solution(new int[] { 10, 2, 5, 1, 8, 20 });

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case02(){

        Triangle triangle = new Triangle();

        int result = triangle.solution(new int[] { Integer.MAX_VALUE -2, Integer.MAX_VALUE -1, Integer.MAX_VALUE });

        assertThat(result).isEqualTo(1);
    }
}
