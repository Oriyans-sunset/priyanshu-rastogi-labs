package com.priyanshu.lab6.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise7 {
	static int[] getSorted(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int num: arr) {
            String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
            list.add(Integer.parseInt(reversed));
        }

        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i=0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 617, 859, 54, 1972};
        System.out.println(Arrays.toString(getSorted(arr)));
    }
}
