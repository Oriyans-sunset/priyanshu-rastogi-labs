package com.priyanshu.lab8.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("target.txt");

            CopyDataTask task = new CopyDataTask(fis, fos);
            Thread thread = new Thread(task);

            thread.start();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}