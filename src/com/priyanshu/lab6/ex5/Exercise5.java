package com.priyanshu.lab6.ex5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
	static int getSecondSmallest(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int num: arr) {
            list.add(num);
        }

        Collections.sort(list);
        int secondSmallest = list.get(1);
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Second smallest: " + getSecondSmallest(arr));
    }
}
