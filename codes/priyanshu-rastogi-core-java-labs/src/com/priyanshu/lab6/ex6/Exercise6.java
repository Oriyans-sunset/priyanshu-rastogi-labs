package com.priyanshu.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {
	static List<Integer> votersList(Map<Integer, Integer> personMap) {
        List<Integer> voters = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry: personMap.entrySet()) {
            if (entry.getValue() > 18) {
                voters.add(entry.getKey());
            }
        }

        return voters;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1001, 25);
        map.put(1002, 17);
        map.put(1003, 30);
        map.put(1004, 18);

        System.out.println(votersList(map));
    }
}
