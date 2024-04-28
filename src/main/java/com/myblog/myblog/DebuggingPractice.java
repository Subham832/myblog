package com.myblog.myblog;

public class DebuggingPractice {
    public static void main(String[] args) {
       DebuggingPractice debuggingPractice = new DebuggingPractice();
        int val = debuggingPractice.test();
        System.out.println(val);
    }
    public int test(){
        int x = 100;
        return x*x;
    }
}
