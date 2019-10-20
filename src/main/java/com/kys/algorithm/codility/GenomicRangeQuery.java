package com.kys.algorithm.codility;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q){

        Genomic genomic = new Genomic(S);

        int[] results = new int[P.length];

        for (int i = 0; i < P.length && i < Q.length; i++) {
            results[i] = genomic.rangeQuery(P[i], Q[i]);
        }

        return results;
    }

    class Genomic {

        public static final int NUCLEOTIDE_SIZE = 4;

        private final String dna;

        private final int[][] cache;

        public Genomic(String dna) {
            this.dna = dna;
            this.cache = new int[NUCLEOTIDE_SIZE][dna.length()+1]; // padding
            indexing();
        }

        private int findImpactFactor(char c){
            if(c == 'A') return 1;
            else if( c == 'C')return 2;
            else if( c == 'G')return 3;
            else return 4;
        }

        private void indexing(){

            int length = dna.length();

            int[] impactCount = new int[NUCLEOTIDE_SIZE];

            for (int i = 0; i < length; i++) {

                int impactFactor = findImpactFactor(dna.charAt(i));

                impactCount[impactFactor-1] += 1;

                for (int j = 0; j < NUCLEOTIDE_SIZE; j++) {
                    cache[j][i+1] = impactCount[j];
                }
            }
        }

        public int rangeQuery(int P, int Q){

            if(P == Q){
                return findImpactFactor(dna.charAt(P));
            }

            for (int index = 0; index < NUCLEOTIDE_SIZE; index++) {
                int end = cache[index][Q+1];
                int start = cache[index][P];
                if(end - start > 0){
                    return index + 1;
                }
            }

            return -1;
        }
    }
}
