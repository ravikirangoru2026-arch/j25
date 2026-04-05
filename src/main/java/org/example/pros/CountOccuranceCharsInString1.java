package org.example.pros;

import java.util.HashSet;

public class CountOccuranceCharsInString1 {
    public static void main(String[] args) {

        String str = new String("Java Programming language");
        char[] charArray = str.toCharArray();

        HashSet<Character> hs2 = new HashSet<>();
        for (char x : charArray) {
            hs2.add(x);
        }
        System.out.println(hs2);
        hs2.stream().forEach(x -> CountOccuranceCharsInString1.printOccurences(x, str));
        //hs2.stream().forEach(x -> System.out.println(x + " is occured " + str.chars().filter(i -> i == x).count()));
    }

    public static void printOccurences(char x, String str) {
        System.out.println(x + " is occured " + str.chars().filter(i -> i == x).count());
    }
}
