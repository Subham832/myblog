package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTestClass {
    public static void main(String[] args) {
        //Example 1
//        Function<String,Integer> result = str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);

        //Example 2
//        Function<Integer,Integer> result1 = i->i+10;
//        Integer val1 = result1.apply(30);
//        System.out.println(val1);

        //Example 3
//        List<Integer> data = Arrays.asList(10, 20, 30, 60, 90);
//        List<Integer> newNumbers = data.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(newNumbers);

        //Example 4 Convert All Name To Upper Case
//        List<String> data1 = Arrays.asList("mike", "stallin", "adam");
//        List<String> newData = data1.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);

        //Example 5 To Sort The Data In String Value
//        List<String> data2 = Arrays.asList("mike", "stallin", "adam");
//        List<String> newData1 = data2.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData1);

        //Example 6 Sort The Number In Integer
//        List<Integer> data3 = Arrays.asList(15, 3, 60, 100, 1);
//        List<Integer> newData2 = data3.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData2);

        //Example 7 Remove Duplicate Value From The Given Collection
        List<Integer> data4 = Arrays.asList(15, 3, 60, 100, 1,15,100,60);
        List<Integer> newData3 = data4.stream().distinct().collect(Collectors.toList());
        System.out.println(newData3);

    }
}
