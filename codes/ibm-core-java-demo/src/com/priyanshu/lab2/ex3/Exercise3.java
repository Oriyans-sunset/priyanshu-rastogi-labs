package com.priyanshu.lab2.ex3;

import java.util.Arrays;

public class Exercise3 {
	static int[] getSorted(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            String numStr = String.valueOf(Math.abs(num));
            String reversedStr = new StringBuilder(numStr).reverse().toString();
            int reversedNum = Integer.parseInt(reversedStr);
            result[i] = reversedNum;
        }

        Arrays.sort(result);
        return result;
	}
	public static void main(String[] args) {
		int[] arr = {123, 5642, 856, 1358, 34512, 8363, 7134};
		System.out.println(Arrays.toString(getSorted(arr)));
	}
}
