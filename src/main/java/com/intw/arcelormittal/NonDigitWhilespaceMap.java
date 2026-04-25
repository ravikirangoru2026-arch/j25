package com.intw.arcelormittal;

import java.util.HashMap;

public class NonDigitWhilespaceMap {
    static boolean isDigit(char a) {
        if (a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')
            return true;
        else
            return false;
    }

    static boolean isWhitespace(char a) {
        if (a == ' ')
            return true;
        else
            return false;
    }


    static void printMapOfNonDigitWhiteSpaceChars1(String input) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char a : input.toCharArray()) {
            if (!Character.isDigit(a) && !Character.isWhitespace(a)) {

                //hm.computeIfAbsent(a, (v) -> 0);
                //hm.computeIfPresent(a, (k, v) -> v + 1);
                hm.put(a,hm.getOrDefault(a,0) +1);
            }
        }
        System.out.println(hm);
    }

    static void printMapOfNonDigitWhiteSpaceChars2(String input) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char a : input.toCharArray()) {
            if (!isDigit(a) && !isWhitespace(a)) {
                hm.computeIfAbsent(a, (v) -> 0);
                hm.computeIfPresent(a, (k, v) -> v + 1);
                //hm.put(a,hm.getOrDefault(a,0) +1);
            }
        }
        System.out.println(hm);
    }
    static void main() {
        String input = "Hello World 123 !";
        printMapOfNonDigitWhiteSpaceChars1(input);
        printMapOfNonDigitWhiteSpaceChars2(input);
    }
}
