package com.kys.algorithm.codility;

public class MaxCounters {

    public int[] solution(int N, int[] A){

        Counter counter = new Counter(N);

        for (int K : A) {
            counter.update(K);
        }

        return counter.result();
    }

    class Counter{

        private final int max;

        private final int[] cache;

        private int maxValue = 0;

        private int captureValue = -1;

        public Counter(int max) {
            this.max = max;
            this.cache = new int[max];
        }

        public void update(int pos){
            if(pos == (max + 1)) captureMaxValue();
            else updateByPos(pos);
        }

        void updateByPos(int pos){

            if(captureValue > -1 && cache[pos-1] < captureValue){
                cache[pos-1] = captureValue;
            }

            cache[pos-1] += 1;
            maxValue = Math.max(cache[pos-1], maxValue);
        }

        void captureMaxValue(){
            captureValue = maxValue;
        }

        public int[] result(){

            for (int index = 0; index < max; index++) {
                if(cache[index] < captureValue){
                    cache[index] = captureValue;
                }
            }

            return cache;
        }
    }
}
