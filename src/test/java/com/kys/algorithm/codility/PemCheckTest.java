package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PemCheckTest {

    @Test
    public void case01(){

        PermCheck permCheck = new PermCheck();

        int result = permCheck.solution(new int[] {4, 1, 3, 2});

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case02(){

        PermCheck permCheck = new PermCheck();

        int result = permCheck.solution(new int[] {4, 1, 3});

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void case03(){

        PermCheck permCheck = new PermCheck();

        int result = permCheck.solution(new int[] {1, 100000000});

        assertThat(result).isEqualTo(0);
    }
}
