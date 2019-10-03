package com.kys.algorithm.codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJumpTest {

    @Test
    public void case01(){
        FrogJump frogJump = new FrogJump();

        int result = frogJump.solution(10, 85, 30);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void case02(){
        FrogJump frogJump = new FrogJump();

        int result = frogJump.solution(10, 185, 30);

        assertThat(result).isEqualTo(6);
    }

    @Test
    public void case03(){
        FrogJump frogJump = new FrogJump();

        int result = frogJump.solution(5, 105, 3);

        assertThat(result).isEqualTo(34);
    }
}
