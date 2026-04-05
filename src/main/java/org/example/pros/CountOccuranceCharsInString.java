package org.example.pros;

import java.util.HashMap;

public class CountOccuranceCharsInString {
    public static void main(String[] args) {

        String str = new String("Java Programming language");
        char[] charArray = str.toCharArray();
        int lngt = charArray.length;
        //i
        HashMap<Character, Integer> hs1 = new HashMap<>();

        System.out.println(hs1);
        for (int i = 0; i < lngt; i++) {
            hs1.putIfAbsent(charArray[i], 0);
            hs1.computeIfPresent(charArray[i], (k, v) -> v + 1);
        }
        System.out.println(hs1);
    }
}
