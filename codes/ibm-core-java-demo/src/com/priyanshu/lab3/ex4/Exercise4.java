package com.priyanshu.lab3.ex4;

import java.util.Scanner;

public class Exercise4 {

    static int modifyNumber(int number1) {
        String numStr = String.valueOf(number1);
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < numStr.length() - 1; i++) {
            int digit1 = numStr.charAt(i) - '0';       
            int digit2 = numStr.charAt(i + 1) - '0';   
            int diff = Math.abs(digit1 - digit2);       
            result.append(diff);
        }

        result.append(numStr.charAt(numStr.length() - 1));

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
    		System.out.println("Enter number: ");
    		Scanner sc = new Scanner(System.in);
    		int num = sc.nextInt();
    		sc.close();
    		
    		System.out.println(modifyNumber(num));      
    }
}