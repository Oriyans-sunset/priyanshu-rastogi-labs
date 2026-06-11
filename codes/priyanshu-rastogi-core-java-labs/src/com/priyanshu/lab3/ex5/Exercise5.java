package com.priyanshu.lab3.ex5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (write END on a new line to stop): ");

        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();

            if (line.equals("END")) {
            		break; 
            }

            lineCount += 1;                         
            charCount += line.length();         


            if (!line.trim().isEmpty()) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        }

        System.out.println("number of chars : " + charCount);
        System.out.println("number of lines : " + lineCount);
        System.out.println("number of words : " + wordCount);

        sc.close();
    }
}
