package com.priyanshu.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {
	public static List<Integer> getValues(HashMap<Integer, Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        return values;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 50);
        map.put(2, 20);
        map.put(3, 40);
        map.put(4, 10);

        System.out.println("Sorted vals: " + getValues(map));
    }
}
