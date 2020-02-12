package com.kys.algorithm.codility;

import com.kys.algorithm.bfs.Test01;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test01Verfy {

    @Test
    public void case01(){

        Test01 test01 = new Test01();

        int result = test01.solution(new String[] {"co","dil","ity"});

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void case02(){

        Test01 test01 = new Test01();

        int result = test01.solution(new String[] {"abc","yyy","def", "csv"});

        assertThat(result).isEqualTo(6);
    }

    @Test
    public void case03(){

        Test01 test01 = new Test01();

        int result = test01.solution(new String[] {"eva","jqw","tyn","jan"});

        assertThat(result).isEqualTo(9);
    }
}
