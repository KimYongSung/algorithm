package com.kys.algorithm.codility;

import com.kys.algorithm.hash.Test02;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test02Verify {

    @Test
    public void case01(){

        Test02 test02 = new Test02();

        int result = test02.solution("aabcaabcabda");

        assertThat(result).isEqualTo(7);
    }

    @Test
    public void case02(){

        Test02 test02 = new Test02();

        int result = test02.solution("aaa");

        assertThat(result).isEqualTo(1);
    }
}
