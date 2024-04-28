package com.myblog.myblog;

public class SampleTestForTernaryOperator {
    public static void main(String[] args) {

       // result = (condition) ? expression1 : experssion2; //Ternary Operator Syntax.
             //If the (condition) is True then expression1 will work.
             //If the (condition) is False the expression2 will work.
        int x = 10;
        int y = 20;
        //using ternary operator to find the maximum of two numbers
          int max = (x>y) ? x:y;
        System.out.println("The maximum value is: "+max);

    }
}
