package com.kys.algorithm.baekjoon;

import org.assertj.core.data.Index;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class No1260Test {

    @Test
    public void case02_bfs확인(){

        // given
        No1260ParamBuilder builder = No1260ParamBuilder.builder()
                                                       .firstLine(5, 5, 3)
                                                       .vertexs(5,4)
                                                       .vertexs(5,2)
                                                       .vertexs(1,2)
                                                       .vertexs(3,4)
                                                       .vertexs(3,1)
                                                       ;
        No1260 no1260 = new No1260(builder.build());
        System.out.println(no1260.toString());

        // when
        List<Integer> bfsResult = no1260.bfs();
        List<Integer> dfsResult = no1260.dfs();

        // then
        assertThat(bfsResult).contains(3, Index.atIndex(0))
                             .contains(1, Index.atIndex(1))
                             .contains(4, Index.atIndex(2))
                             .contains(2, Index.atIndex(3))
                             .contains(5, Index.atIndex(4))
        ;

        assertThat(dfsResult).contains(3, Index.atIndex(0))
                             .contains(1, Index.atIndex(1))
                             .contains(2, Index.atIndex(2))
                             .contains(5, Index.atIndex(3))
                             .contains(4, Index.atIndex(4))
        ;
    }

    @Test
    public void case01_확인(){

        // given
        No1260ParamBuilder builder = No1260ParamBuilder.builder()
                                                       .firstLine(4, 5, 1)
                                                       .vertexs(1,2)
                                                       .vertexs(1,3)
                                                       .vertexs(1,4)
                                                       .vertexs(2,4)
                                                       .vertexs(3,4);
        No1260 no1260 = new No1260(builder.build());
        System.out.println(no1260.toString());

        // when
        List<Integer> dfsResult = no1260.dfs();
        List<Integer> bfsResult = no1260.bfs();

        // then
        assertThat(dfsResult).contains(1, Index.atIndex(0))
                             .contains(2, Index.atIndex(1))
                             .contains(4, Index.atIndex(2))
                             .contains(3, Index.atIndex(3));

        assertThat(bfsResult).contains(1, Index.atIndex(0))
                             .contains(2, Index.atIndex(1))
                             .contains(3, Index.atIndex(2))
                             .contains(4, Index.atIndex(3));
    }

    @Test
    public void case03_확인(){

        // given
        No1260ParamBuilder builder = No1260ParamBuilder.builder()
                                                       .firstLine(1000, 1, 1000)
                                                       .vertexs(999,1000)
                                                       ;
        No1260 no1260 = new No1260(builder.build());
        System.out.println(no1260.toString());

        // when
        List<Integer> dfsResult = no1260.dfs();
        List<Integer> bfsResult = no1260.bfs();

        // then
        assertThat(dfsResult).contains(1000, Index.atIndex(0))
                .contains(999, Index.atIndex(1));

        assertThat(bfsResult).contains(1000, Index.atIndex(0))
                .contains(999, Index.atIndex(1));
    }


    static class No1260ParamBuilder{

        public static final String STR = " ";

        private final StringBuilder builder = new StringBuilder();

        public static No1260ParamBuilder builder(){
            return new No1260ParamBuilder();
        }

        public No1260ParamBuilder firstLine(int vertexCount, int edgeCount, int startVertex){
            builder.append(vertexCount).append(STR).append(edgeCount).append(STR).append(startVertex).append("\n");
            return this;
        }

        public No1260ParamBuilder vertexs(int vertex1, int vertex2){
            builder.append(vertex1).append(STR).append(vertex2).append("\n");
            return this;
        }

        public StringReader build(){
            return new StringReader(builder.toString());
        }
    }
}
