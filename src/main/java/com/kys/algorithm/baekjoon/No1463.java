package com.kys.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class No1463 {

    private Reader reader;

    private int[] cache;

    public No1463(Reader reader) {
        this.reader = reader;
    }

    public static void main(String[] args){
        No1463 no1463 = new No1463(new InputStreamReader(System.in));

        int result = no1463.findCalculationCount();

        System.out.println(result);
    }

    private int init(){
        try(BufferedReader bufferedReader = new BufferedReader(reader);){

            String firstLine = bufferedReader.readLine();

            int num = Integer.parseInt(firstLine);
            cache = new int[num+1];
            return num;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public int findCalculationCount(){

        int num = init();

        return topDown(num);
    }

    private int bottomUp(int num){

        Arrays.fill(cache, num);

        cache[1] = 0;

        for (int index = 1; index < num; index++){
            cache[index+1] = Math.min(cache[index+1], cache[index] + 1);
            if(index * 2 < num) cache[index * 2] = Math.min(cache[index*2] , cache[index]+1);
            if(index * 3 < num) cache[index * 3] = Math.min(cache[index*3] , cache[index]+1);
        }

        return cache[num];
    }

    private int topDown(int num){

        if(num == 1) return 0;
        if(cache[num] != 0) return cache[num];

        int result = topDown(num-1);
        if(num % 3 == 0) result = Math.min(topDown(num / 3), result);
        if(num % 2 == 0) result = Math.min(topDown(num / 2), result);

        cache[num] = result + 1;

        return cache[num];
    }


}
