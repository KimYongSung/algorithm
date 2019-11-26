package com.kys.algorithm;

import org.junit.Test;

import java.util.LinkedList;

import static org.assertj.core.api.Assertions.*;

public class WordChangeTest {

    @Test
    public void checkerTest(){

        //given
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        // when
        WordChange wordChange = new WordChange();
        int answer = wordChange.solution(begin, target, words);

        // then
        assertThat(answer).isEqualTo(4);
    }

    @Test
    public void checkerTest2(){

        //given
        String begin = "hit";
        String target = "hhh";
        String[] words = {"hhh","hht"};

        // when
        WordChange wordChange = new WordChange();
        int answer = wordChange.solution(begin, target, words);

        // then
        assertThat(answer).isEqualTo(2);
    }
}
