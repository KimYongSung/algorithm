package com.kys.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * 백준 1260번
 */
public class No1260 {

    private Reader reader;

    private int startVertex;

    private int vertexCount;

    private int edgeCount;

    private Graph graph;

    public No1260(Reader reader) {
        this.reader = reader;
        init();
    }

    public void init() {
        try(BufferedReader bufferedReader = new BufferedReader(reader);){

            String firstLine = bufferedReader.readLine();
            String[] firstArgs = firstLine.split(" ");

            this.vertexCount = Integer.parseInt(firstArgs[0]);
            this.edgeCount   = Integer.parseInt(firstArgs[1]);
            this.startVertex = Integer.parseInt(firstArgs[2]);
            this.graph       = new Graph(vertexCount);

            for (int index = 0; index < edgeCount; index++) {
                String input = bufferedReader.readLine();

                String[] inputs = input.split(" ");

                int vertex1 = Integer.parseInt(inputs[0]);
                int vertex2 = Integer.parseInt(inputs[1]);

                graph.add(vertex1, vertex2);
            }

            graph.sort();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> dfs(){
        return graph.dfs(startVertex);
    }

    public List<Integer> bfs(){
        return graph.bfs(startVertex);
    }

    public String toString(){
        return graph.toString();
    }

    /**
     * 데이터 저장용 Graph
     */
    class Graph {

        private AdjacencyNode adjacencyNodes[];

        public Graph(int length){
            this.adjacencyNodes = new AdjacencyNode[length];
        }

        void add(int e1, int e2) {
            AdjacencyNode adjacencyNode1 = getNode(e1);
            AdjacencyNode adjacencyNode2 = getNode(e2);

            adjacencyNode1.addEdge(adjacencyNode2);
            adjacencyNode2.addEdge(adjacencyNode1);
        }

        AdjacencyNode getNode(int index){

            if(index > adjacencyNodes.length){
                throw new IndexOutOfBoundsException("node length : " + adjacencyNodes.length);
            }else if(index < 0){
                throw new IndexOutOfBoundsException("음수가 들어왔습니다.");
            }

            AdjacencyNode adjacencyNode = adjacencyNodes[index-1];

            if(Objects.isNull(adjacencyNode)){
                adjacencyNode = new AdjacencyNode(index);
                adjacencyNodes[index-1] = adjacencyNode;
            }

            return adjacencyNode;
        }

        public void sort(){
            for (int index = 0; index < adjacencyNodes.length; index++) {
                AdjacencyNode adjacencyNode = adjacencyNodes[index];

                if(Objects.isNull(adjacencyNode)){
                    continue;
                }

                adjacencyNode.sort();
            }
        }

        @Override
        public String toString(){
            StringBuilder builder = new StringBuilder("AdjacencyList \n");
            for (int index = 0; index < adjacencyNodes.length; index++) {
                AdjacencyNode adjacencyNode = adjacencyNodes[index];

                if(Objects.isNull(adjacencyNode)){
                    continue;
                }

                builder.append(adjacencyNode.vertex).append(" : ").append(adjacencyNode.edges.toString()).append("\n");
            }
            return builder.toString();
        }

        /**
         * DFS 검색
         * @return
         */
        public List<Integer> dfs(int startVertex){
            List<Integer> result = new ArrayList<>(adjacencyNodes.length);
            boolean[] visit = new boolean[adjacencyNodes.length];
            AdjacencyNode adjacencyNode = graph.getNode(startVertex);
            visit[adjacencyNode.getIndex()] = true;
            result.add(adjacencyNode.vertex);

            dfs(result, visit, adjacencyNode);

            return result;
        }

        /**
         * DFS용 재귀함수
         * @param result
         * @param visit
         * @param currAdjacencyNode
         */
        private void dfs(List<Integer> result, boolean[] visit, AdjacencyNode currAdjacencyNode){

            for (AdjacencyNode adjacencyNode : currAdjacencyNode.edges) {
                if(!visit[adjacencyNode.getIndex()]){
                    result.add(adjacencyNode.vertex);
                    visit[adjacencyNode.getIndex()] = true;
                    dfs(result, visit, adjacencyNode);
                }
            }
        }

        /**
         * BFS 검색
         * @return
         */
        public List<Integer> bfs(int startVertex){
            List<Integer> result = new ArrayList<>(adjacencyNodes.length);
            boolean[] visit = new boolean[adjacencyNodes.length];
            AdjacencyNode adjacencyNode = graph.getNode(startVertex);

            Queue<AdjacencyNode> queue = new LinkedList<>();
            queue.add(adjacencyNode);
            visit[adjacencyNode.getIndex()] = true;
            result.add(adjacencyNode.vertex);

            while(!queue.isEmpty()){

                AdjacencyNode curr = queue.poll();

                for (AdjacencyNode edge : curr.edges) {
                    if(visit[edge.getIndex()]){
                        continue;
                    }

                    visit[edge.getIndex()] = true;
                    result.add(edge.vertex);
                    queue.add(edge);
                }
            }

            return result;
        }
    }

    /**
     * Node 관리
     */
    class AdjacencyNode implements Comparable<AdjacencyNode>{

        private final int vertex;

        private final LinkedList<AdjacencyNode> edges;

        public AdjacencyNode(int vertex){
            this.vertex = vertex;
            this.edges = new LinkedList<>();
        }

        void addEdge(AdjacencyNode e){
            edges.add(e);
        }

        public void sort(){
            Collections.sort(edges);
        }

        public int getIndex(){
            return vertex -1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AdjacencyNode adjacencyNode = (AdjacencyNode) o;
            return vertex == adjacencyNode.vertex;
        }

        @Override
        public int hashCode() {
            return Objects.hash(vertex);
        }

        @Override
        public String toString() {
            return String.valueOf(vertex);
        }

        @Override
        public int compareTo(AdjacencyNode o) {
            return this.vertex > o.vertex ? 1 : -1;
        }
    }

}
