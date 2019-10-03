package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermMissingElemTest {

    @Test
    public void case01(){
        PermMissingElem permMissingElem = new PermMissingElem();

        int result = permMissingElem.solution(new int[] {2, 3, 1, 5});

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void case02(){
        PermMissingElem permMissingElem = new PermMissingElem();

        int result = permMissingElem.solution(new int[] {2, 3, 1, 5, 4, 6,8,9,10});

        assertThat(result).isEqualTo(7);
    }
}
