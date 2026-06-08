package com.priyanshu.lab8.ex2;

public class Exercise2 implements Runnable {

    @Override
    public void run() {
        int seconds = 0;

        while (true) {
            System.out.println("Timer: " + seconds + " seconds");
            seconds += 10;

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}