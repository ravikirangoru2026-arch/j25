package org.example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class EmployeeSorting {
    public static void main(String[] args) {
        Employee e1 = new Employee(21, "ravi", "abc");
        Employee e2 = new Employee(11, "Raj", "zsc");
        Employee e3 = new Employee(7, "Balu", "xyc");
        Employee e4 = new Employee(25, "rm", "hbc");
        List<Employee> eList = Arrays.asList(e1, e2, e3, e4);
        System.out.println(eList);
        Collections.sort(eList);
        System.out.println(eList);
        Collections.sort(eList, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(eList);
    }
}
