package com.priyanshu.lab8.ex2;

public class Exercise2Timer {
	public static void main(String[] args) {

        Runnable task = new Exercise2();
        Thread thread = new Thread(task);

        thread.start();
    }

}
