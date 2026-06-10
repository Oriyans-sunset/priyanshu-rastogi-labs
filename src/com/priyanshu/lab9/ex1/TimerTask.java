package com.priyanshu.lab9.ex1;

public class TimerTask implements Runnable {

    @Override
    public void run() {

        int seconds = 0;

        while (true) {
            System.out.println("Timer: " + seconds + " seconds");
            seconds += 10;

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}