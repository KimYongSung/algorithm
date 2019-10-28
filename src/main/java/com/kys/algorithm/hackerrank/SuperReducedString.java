package com.kys.algorithm.hackerrank;

public class SuperReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        return reducedString(s, 0);
    }

    static String reducedString(String s, int start){

        if(start+1 == s.length()) return s;

        char c1 = s.charAt(start);
        char c2 = s.charAt(start+1);


        if (c1 == c2) {

            if(s.length() > 2){
                String temp1 = s.substring(0, start);
                String temp2 = s.substring(start+2);
                return reducedString(temp1 + temp2 , 0);
            }else{
                return "Empty String";
            }
        }

        return reducedString(s, start+1);
    }
}
