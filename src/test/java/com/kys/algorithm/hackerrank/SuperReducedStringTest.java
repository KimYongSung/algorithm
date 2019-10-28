package com.kys.algorithm.hackerrank;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperReducedStringTest {

    @Test
    public void case01(){
        // given
        String input = "aaabccddd";

        // when
        String result = SuperReducedString.superReducedString(input);

        // then
        assertThat(result).isEqualTo("abd");
    }

    @Test
    public void case02(){
        // given
        String input = "aa";

        // when
        String result = SuperReducedString.superReducedString(input);

        // then
        assertThat(result).isEqualTo("Empty String");
    }

    @Test
    public void case03(){
        // given
        String input = "baab";

        // when
        String result = SuperReducedString.superReducedString(input);

        // then
        assertThat(result).isEqualTo("Empty String");
    }
}
