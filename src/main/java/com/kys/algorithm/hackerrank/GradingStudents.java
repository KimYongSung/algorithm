package com.kys.algorithm.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream()
                     .map(GradingStudents::gradeCheck)
                     .collect(Collectors.toList());
    }

    public static Integer gradeCheck(Integer grade){
        if(grade < 38) return grade;

        int mod = grade % 5;

        if(mod <= 2) return grade;

        return ( grade + 5 ) - mod;
    }
}
