package com.kys.algorithm.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);

        int max = 0;
        int count = 1;
        int num = a.get(0);

        for (int i = 1; i < a.size(); i++) {

            int num1 = a.get(i);

            if(num == num1){
                count++;
            }else if(num1 - num > 1){
                max = Math.max(max, count);
                count = 1;
                num = num1;
            }else{
                count++;
            }
        }

        return Math.max(max, count);
    }
}
