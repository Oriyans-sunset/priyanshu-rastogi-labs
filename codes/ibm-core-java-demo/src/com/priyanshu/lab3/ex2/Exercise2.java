package com.priyanshu.lab3.ex2;

public class Exercise2 {
	static String getImage(String str) {
        String reversed = new StringBuffer(str).reverse().toString();
        return str + "|" + reversed;
    }
    
    public static void main(String[] args) {     
        System.out.println(getImage("EARTH"));   
        System.out.println(getImage("JAVA"));   
        System.out.println(getImage("HELLO"));
        System.out.println(getImage("12345"));   
    }
}
