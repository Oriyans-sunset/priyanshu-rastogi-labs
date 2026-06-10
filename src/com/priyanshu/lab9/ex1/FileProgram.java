package com.priyanshu.lab9.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("target.txt");

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(new CopyDataTask(fis, fos));

        executor.shutdown();
    }
}