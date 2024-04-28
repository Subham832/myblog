package com.myblog.myblog;

public class DebuggingPracticeExample2 {
    public static void main(String[] args) {
        DebuggingPracticeExample2 debuggingPracticeExample2 = new DebuggingPracticeExample2();
        int val = debuggingPracticeExample2.test();
        System.out.println(val);

    }
    public int test(){
       int otp = DebuggingPracticeExample2ConnectedWithExample3.test1();
       return otp;

    }
}
