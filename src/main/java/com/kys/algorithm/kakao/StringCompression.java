package com.kys.algorithm.kakao;

import java.util.Arrays;

public class StringCompression {

    public int solution(String s){

        int length = s.length();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            Compression compression = new Compression(s, i+1);
            String compressStr = compression.compress();
            result[i] = compressStr.length();
        }

        Arrays.sort(result);

        return result[0];
    }

    class Compression{

        private final String str;
        private final int compressSize;
        private final StringBuilder builder = new StringBuilder();
        private String compressStr;
        private int hitCount = 1;

        public Compression(String str, int compressSize) {
            this.str = str;
            this.compressSize = compressSize;

            this.compressStr = str.substring(0, compressSize);
        }

        public String compress(){

            int pos     = compressSize;
            int length  = str.length();

            while(true){

                if(pos + compressSize > length){
                    appendCompressStr();
                    init(str.substring(pos));
                    appendCompressStr();
                    break;
                }

                String temp = str.substring(pos, (pos += compressSize));

                if(compressStr.equals(temp)){
                    updateHitCount();
                    continue;
                }else{
                    appendCompressStr();
                    init(temp);
                }
            }

            return builder.toString();
        }

        private void updateHitCount() {
            this.hitCount++;
        }

        private void init(String temp) {
            this.hitCount = 1;
            this.compressStr = temp;
        }

        private void appendCompressStr() {
            if(hitCount > 1)
                builder.append(hitCount);

            builder.append(compressStr);
        }

    }
}
