package com.priyanshu.lab3.ex3;

import java.util.Scanner;

public class Exercise3 {
	static String alterString(String input) {
		String vowels = "aeiouAEIOU";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
				result.append((char) (ch + 1));
			} else {
				result.append(ch);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		System.out.println(alterString(word));
	}
}
