package com.priyanshu.lab9.ex2;

public class Exercise2 {

    static boolean validateUserName(String userName) {
        if (!userName.endsWith("_job")) {
            return false;
        }

        int index = userName.indexOf("_job");

        return index >= 8;
    }

    public static void main(String[] args) {
        System.out.println(validateUserName("priyanshu_job"));
        System.out.println(validateUserName("priyanshu"));
    }
}
