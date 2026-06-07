package com.priyanshu.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
	static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marksMap) {
        HashMap<Integer, String> medalMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry: marksMap.entrySet()) {
            int regNo = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } else if (marks >= 80) {
                medalMap.put(regNo, "Silver");
            } else if (marks >= 70) {
                medalMap.put(regNo, "Bronze");
            } else {
            	medalMap.put(regNo, "None");
            }
        }

        return medalMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> marksMap = new HashMap<>();
        marksMap.put(1001, 95);
        marksMap.put(1002, 85);
        marksMap.put(1003, 75);
        marksMap.put(1004, 65);

        System.out.println(getStudents(marksMap));
    }
}
