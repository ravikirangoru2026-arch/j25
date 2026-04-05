package org.example.j8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinnerEx {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("a");
        sj.add("b");
        sj.add("c");
        System.out.println(sj.length());
        System.out.println(sj.toString());

        StringJoiner sj2 = new StringJoiner(",", "{", "}");
        sj2.add("a");
        sj2.add("b");
        sj2.add("c");
        System.out.println(sj2.length());
        System.out.println(sj2.toString());


        String s = String.join(",", "a", "b","c");
        System.out.println(s);
        List<String> list = Arrays.asList("a","b","c");
        String s1= String.join("|",list);
        System.out.println(s1);

    }
}
