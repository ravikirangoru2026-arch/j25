package org.example.pros;

import java.util.HashSet;

public class CountOccuranceCharsInString2 {
    public static void main(String[] args) {
        String str = new String("Java Programming language");

        str.chars().distinct().forEach(x -> System.out.println((char) x + " is occured " + str.chars().filter(i -> i == x).count() + "times."));
    }
}
