package com.priyanshu.lab1.ex7;

import java.util.Scanner;

public class Exercise7 {
	static Boolean checkNum(int number) {
		String digits = String.valueOf(number);

        for (int i = 1; i < digits.length(); i++) {
            if (digits.charAt(i) < digits.charAt(i - 1)) {
                return false;
            }
        }
        return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.print(checkNum(num));
	}
}
