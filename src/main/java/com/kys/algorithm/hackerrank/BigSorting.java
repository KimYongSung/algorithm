package com.kys.algorithm.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {

        Arrays.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1Length = o1.length();
                int o2Length = o2.length();

                if(o1Length > o2Length) return 1;
                else if(o1Length < o2Length) return -1;

                for (int i = 0; i < o1Length; i++) {
                    int c1 = o1.charAt(i);
                    int c2 = o2.charAt(i);

                    if(c1 > c2) return 1;
                    else if(c1 < c2) return  -1;
                }
                return 0;
            }
        });

        return unsorted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        StringBuilder strBuilder = new StringBuilder();

        for (String str : result) {
            strBuilder.append(str).append("\n");
        }

        System.out.println(strBuilder);

        scanner.close();
    }

}
