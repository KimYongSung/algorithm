package com.kys.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

public class No2178 {

    private final Reader reader;

    private int nSize;

    private int mSize;

    private int[][] maze;

    public static void main(String args[]){
        No2178 no2178 = new No2178(new InputStreamReader(System.in));

        int result = no2178.bfs();

        System.out.println(result);
    }

    public No2178(Reader reader){
        this.reader = reader;
        init();
    }

    public void init() {

        try(BufferedReader bufferedReader = new BufferedReader(reader);){

            String firstLine = bufferedReader.readLine();
            String[] firstArgs = firstLine.split(" ");

            nSize = Integer.parseInt(firstArgs[0]);
            mSize = Integer.parseInt(firstArgs[1]);
            maze = new int[nSize][mSize];

            for (int index = 0; index < nSize; index++) {

                String input = bufferedReader.readLine();

                for (int charPos = 0; charPos < input.length(); charPos++) {
                    maze[index][charPos] = (int) input.charAt(charPos) - 48;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int bfs(){

        List<Explorer> result = new ArrayList<>();
        Queue<Explorer> queue = new LinkedList<>();

        boolean[][] visit = new boolean[nSize][mSize];
        visit[0][0] = true;
        queue.add(new Explorer(1, 0, 0));

        while(!queue.isEmpty()){
            Explorer explorer = queue.poll();

            if(isFinish(explorer)){
                result.add(explorer);
                continue;
            }

            for (int i = 0; i < nSize; i++) {

                if(!explorer.isMoveN(i)) continue;

                for (int j = 0; j < mSize; j++) {

                    if (visit[i][j] || maze[i][j] == 0) continue;

                    if (explorer.isMoveM(i, j) || explorer.isMoveN(i,j)){
                        visit[i][j] = true;
                        queue.add(explorer.move(i, j));
                    }
                }
            }
        }

        if(result.isEmpty()){
            return 0;
        }

        Collections.sort(result);

        return result.get(0).moveCount;
    }

    public boolean isFinish(Explorer curr){
        return curr.N == nSize-1 && curr.M == mSize-1;
    }

    class Explorer implements Comparable<Explorer>{

        int moveCount;
        final int N;
        final int M;

        Explorer(int moveCount, int N, int M){
            this.moveCount = moveCount;
            this.N = N;
            this.M = M;
        }

        boolean isMoveN(int N){
            return isMove(this.N, N);
        }

        boolean isMoveN(int N, int M){
            return isMove(this.N, N) && this.M == M;
        }

        boolean isMove(int num1, int num2){
            if(num1 == num2){
                return true;
            }

            return num2 == num1 + 1 || num2 == num1 -1;
        }

        boolean isMoveM(int N, int M){
            return isMove(this.M, M) && this.N == N;
        }

        Explorer move( int N, int M){
            return new Explorer(this.moveCount+1, N, M);
        }

        @Override
        public int compareTo(Explorer o) {
            return this.moveCount > o.moveCount ? 1 : -1;
        }

        @Override
        public String toString() {
            return "Explorer{" +
                    "moveCount=" + moveCount +
                    ", N=" + N +
                    ", M=" + M +
                    '}';
        }
    }
}
