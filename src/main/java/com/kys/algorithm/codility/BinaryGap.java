package com.kys.algorithm.codility;

import java.util.Arrays;
import java.util.stream.Stream;

public class BinaryGap {

    public int solution(int N) {
        // write your code in Java SE 8
        String str = Integer.toBinaryString(N);

        int length = str.length();
        boolean isStart = false;
        int hitCount = 0;
        int maxGap = 0;

        for(int pos = 0; pos < length; pos++){

            char c = str.charAt(pos);

            if(c == '1'){

                if(isStart) {
                    maxGap = maxGap < hitCount ? hitCount : maxGap;
                    hitCount = 0;
                }else{
                    isStart = true;
                }
            }else if(c == '0'){
                hitCount++;
            }
        }

        return maxGap;
    }
}
