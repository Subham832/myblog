package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTestClass {
    public static void main(String[] args) {
        //Example 1
//        Predicate<Integer> val = y->y%2==0;
//        boolean result = val.test(10);
//        System.out.println(result);

        //Example 2
//        Predicate<String> val = str->str.equals("mike");
//        boolean result1 = val.test("stallin");
//        System.out.println(result1);

        //Example 3
//        List<Integer> numbers = Arrays.asList(10, 12, 1, 5, 16, 19, 20);
//        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);

        //Example 4
//        List<Integer> numbers = Arrays.asList(10, 12, 1, 5, 16, 19, 20);
//        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(oddNumbers);

        //Example 5 Starting with letter "m".
//        List<String> numbers = Arrays.asList("mike", "stallin", "adam", "mike");
//        List<String> data = numbers.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());
//        System.out.println(data);

        //Example 6 Tell me how many times mike as occured in the given collection.
//        List<String> numbers = Arrays.asList("mike", "stallin", "adam", "mike");
//        List<String> data1 = numbers.stream().filter(s -> s.equals("mike")).collect(Collectors.toList());
//        System.out.println(data1);

        //Example 7 Ends with letter "n".
        List<String> numbers = Arrays.asList("mike", "stallin", "adam", "mike");
        List<String> data2 = numbers.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());
        System.out.println(data2);
    }
}
