package com.kys.algorithm.codility;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

    public int solutionJava7(int[] A) {
        // write your code in Java SE 8
        int length = A.length;

        Map<Integer, Node> maps = new HashMap<>();

        for (int index = 0; index < length; index++) {

            int key = A[index];

            Node node = maps.get(key);

            if(Objects.isNull(node)){
                maps.put(key, new Node(key));
            }else{
                node.addCount();
            }
        }

        Iterator<Integer> keys = maps.keySet().iterator();

        while (keys.hasNext()){
            Integer key = keys.next();
            Node node = maps.get(key);
            if(node.isNotOdd()){
                return node.value;
            }
        }

        return 0;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
       return Arrays.stream(A)
                    .boxed()
                    .collect(Collectors.toMap(Function.identity(), Node::new, (oldValue, newValue) -> oldValue.addCount()))
                    .values()
                    .stream()
                    .filter(Node::isNotOdd)
                    .findFirst()
                    .get()
                    .value
                    ;
    }

    class Node implements Comparable<Node> {
        Integer value;

        int count;

        public Node(Integer value) {
            this.value = value;
            this.count = 1;
        }

        public Node addCount(){
            count++;
            return this;
        }

        public boolean isNotOdd(){
            return count % 2 != 0;
        }

        @Override
        public int compareTo(Node o) {
            return o.count < this.count ? 1 : -1;
        }
    }
}
