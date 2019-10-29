package com.kys.algorithm.hackerrank;

/**
 *                  (10,2,1)                   ->1^2
 *                 /        \
 *                /          \
 *          (10,2,2)        (9,2,2)            ->2^2
 *          /     \         /     \
 *         /       \       /       \
 *     (10,2,3) (6,2,3)  (9,2,3) (5,2,3)       ->3^2
 *     /     \      |       |       |
 *    /       \     0       1       0
 * (10,2,4) (1,2,4)                            ->4^2
 *     |       |
 *     0       0
 */
public class PowerSum {

    static int powerSum(int X, int N) {
        // Complete this function
        return calc(X,N,1);
    }
    static int calc(int x, int n, int num) {
        int numToN= (int) Math.pow(num,n);
        if (numToN > x) {
            return 0;
        } else if (numToN == x) {
            return 1;
        } else {
            return (calc(x,n,num+1) + calc(x-numToN,n,num+1));
        }
    }
}
