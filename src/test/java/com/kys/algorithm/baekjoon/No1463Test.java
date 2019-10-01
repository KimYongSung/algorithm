package com.kys.algorithm.baekjoon;

import org.junit.Test;

import java.io.StringReader;

import static org.assertj.core.api.Assertions.assertThat;

public class No1463Test {

    @Test
    public void case01(){

        No1463 no1463 = new No1463(new StringReader("2"));

        int result = no1463.findCalculationCount();

        assertThat(result).isEqualTo(1);

    }

    @Test
    public void case02(){

        No1463 no1463 = new No1463(new StringReader("10"));

        int result = no1463.findCalculationCount();

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void case03(){

        No1463 no1463 = new No1463(new StringReader("10000000"));

        int result = no1463.findCalculationCount();

        assertThat(result).isEqualTo(22);
    }
}
