package com.priyanshu.lab1.ex8;

import java.util.Scanner;

public class Exercise8 {
	static Boolean checkNum(int number) {
        while (number%2 == 0) {
        		number /= 2;
        }
        if (number == 1) return true;
        else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.print(checkNum(num));
	}
}
