package org.example.pros;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class MaxMinofIntList {
    public static void main(String[] args)
    {
        List<Integer> iList = Arrays.asList(123, 34, 23, 12, 56);
        System.out.println(iList);

        System.out.println(iList.stream().max((x,y)->x-y));
        System.out.println(iList.stream().min((a,b)->a-b));

        System.out.println(iList.stream().max(Integer::compare));
        System.out.println(iList.stream().min(Integer::compare));


    }
}
