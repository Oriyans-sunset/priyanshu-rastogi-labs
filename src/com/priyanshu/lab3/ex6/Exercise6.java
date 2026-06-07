package com.priyanshu.lab3.ex6;

import java.util.Scanner;

public class Exercise6 {

    public static boolean isPositiveString(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) <= str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a word: ");
    	String word = sc.next();
    	sc.close();
    	
        System.out.println(isPositiveString(word));
    }
}
