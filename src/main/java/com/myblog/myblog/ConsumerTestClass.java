package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTestClass {
    public static void main(String[] args) {

        //Example 1
//       Consumer<Integer> result = number-> System.out.println(number);
//       result.accept(100);

        //Example 2
        List<String> names = Arrays.asList("mike", "adam", "sam");
        Consumer<String> val = name-> System.out.println(name);
        names.forEach(val);
    }
}
