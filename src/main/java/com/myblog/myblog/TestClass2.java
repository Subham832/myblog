package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//To filter out the even Numbers, Square each of them & then find the sum of the Squared values
public class TestClass2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 6, 5, 7, 8, 9);
        List<Integer> evenNumbers = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
