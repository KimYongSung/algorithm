package com.kys.algorithm.hackerrank;

public class CamelCase {

    static int camelcase(String s) {

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);

            if(c > 64 && c < 91) count++;
        }

        return count;
    }
}
