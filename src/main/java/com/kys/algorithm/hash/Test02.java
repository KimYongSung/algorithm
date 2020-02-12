package com.kys.algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test02 {

    public int solution(String S) {
        // write your code in Java SE 8
        int length = S.length();

        Map<String, List<Integer>> repo = new HashMap<>();

        for (int i = 0; i < length-1; i++) {

            String str = i+2 > length-1 ? S.substring(i) : S.substring(i, i+2);

            repo.computeIfAbsent(str, s -> new ArrayList<>())
                .add(i+1);
        }

        int max = -1;

        Iterator<String> keys = repo.keySet().iterator();

        while (keys.hasNext()){
            String key = keys.next();
            List<Integer> indexList = repo.get(key);

            if(indexList.size() < 2)
                continue;

            max = Math.max(max, indexList.get(indexList.size()-1) - indexList.get(0));
        }

        return max;
    }
}
