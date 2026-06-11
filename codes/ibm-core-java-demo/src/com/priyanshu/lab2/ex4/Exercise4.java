package com.priyanshu.lab2.ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Exercise4 {
	static int[] modifyArray(int[] arr) {
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i] = num;
            i += 1;
        }

        return result;
	}
	public static void main(String[] args) {
		int[] arr = {123, 5642, 856, 1358, 34512, 8363, 7134};
		System.out.println(Arrays.toString(modifyArray(arr)));
	}
}
