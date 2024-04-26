package com.myblog.myblog;

//Group By

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass3 {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("mike", 30, "chennai"),
                new Employee1("adam", 25, "chennai"),
                new Employee1("stallin", 34, "pune"),
                new Employee1("sam", 34, "bengaluru")
        );
        //Grouping By for City
//        Map<String, List<Employee1>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//        System.out.println(collect);

//        //Grouping By for Age
//        Map<Integer, List<Employee1>> collect1 = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
////        System.out.println(collect1);
//        for (Map.Entry<Integer, List<Employee1>> entry : collect1.entrySet()){
//            int age = entry.getKey();
//            List<Employee1> employeesWithAge = entry.getValue();
//            System.out.println("age:"+age+"----");
//            for (Employee1 e : employeesWithAge){
//                System.out.println(e.getName());
//                System.out.println(e.getAge());
//                System.out.println(e.getCity());
//            }
//        }

        //Grouping By for City
        Map<String, List<Employee1>> collect1 = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//        System.out.println(collect1);
        for (Map.Entry<String, List<Employee1>> entry : collect1.entrySet()){
            String city = entry.getKey();
            List<Employee1> employeesWithAge = entry.getValue();
            System.out.println("city:"+city+"----");
            for (Employee1 e : employeesWithAge){
                System.out.println(e.getName());
                System.out.println(e.getAge());
                System.out.println(e.getCity());
            }
        }
    }
}
