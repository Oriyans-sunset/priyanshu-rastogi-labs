package com.priyanshu.lab9.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataTask implements Runnable {

    private FileInputStream fis;
    private FileOutputStream fos;

    public CopyDataTask(FileInputStream fis, FileOutputStream fos) {
        this.fis = fis;
        this.fos = fos;
    }

    @Override
    public void run() {
        try {
            int ch;
            int count = 0;

            while ((ch = fis.read()) != -1) {
                fos.write(ch);
                count++;

                if (count % 10 == 0) {
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000);
                }
            }

            fis.close();
            fos.close();

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}