package com.priyanshu.lab1.ex2;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		System.out.println("Enter 1 for stop, 2 for ready, 3 for go: ");
		Scanner sc = new Scanner(System.in);
		int light = sc.nextInt();
		sc.close();
		
		switch (light) {
			case 1:
				System.out.println("Stop");
				break;
			case 2:
				System.out.println("Ready");
				break;
			case 3:
				System.out.println("Go");
				break;
		}
		
	}
}
