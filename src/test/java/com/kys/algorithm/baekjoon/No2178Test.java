package com.kys.algorithm.baekjoon;

import org.junit.Test;

import java.io.StringReader;
import static org.assertj.core.api.Assertions.*;

public class No2178Test {

    @Test
    public void case02_bfs확인(){

        // given
        No2178ParamBuilder builder = No2178ParamBuilder.builder()
                                                        .firstLine(4, 6)
                                                        .addMaze(1, 0, 1, 1 ,1,1)
                                                        .addMaze(1, 0, 1, 0 ,1,0)
                                                        .addMaze(1, 0, 1, 0 ,1,1)
                                                        .addMaze(1, 1, 1, 0 ,1,1)
                                                        ;

        No2178 no2178 = new No2178(builder.build());

        // when
        int result = no2178.bfs();

        // then
        assertThat(result).isEqualTo(15);
    }

    static class No2178ParamBuilder{
        public static final String STR = " ";

        private final StringBuilder builder = new StringBuilder();

        public static No2178ParamBuilder builder(){
            return new No2178ParamBuilder();
        }

        public No2178ParamBuilder firstLine(int N, int M){
            builder.append(N).append(STR).append(M).append("\n");
            return this;
        }

        public No2178ParamBuilder addMaze(int... nums){

            for (int num: nums) {
                builder.append(num);
            }

            builder.append("\n");

            return this;
        }

        public StringReader build(){
            return new StringReader(builder.toString());
        }
    }
}
