package com.kys.algorithm.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

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
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        /*for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();*/

        StringBuilder strBuilder = new StringBuilder();

        for (String str : result) {
            strBuilder.append(str).append("\n");
        }

        System.out.println(strBuilder);

        scanner.close();
    }

}
