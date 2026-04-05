package org.example.intv;

import java.util.Arrays;

public class Anargam {
    public static boolean isValidAnargram_NLogN(String str1, String str2) {
        String sortedString1 = getSortedString(str1);
        String sortedString2 = getSortedString(str2);
        return sortedString1.equals(sortedString2);
    }

    private static String getSortedString(String str) {
        char[] charArray = str.toCharArray();//O(n)
        Arrays.sort(charArray);//O(n log n)
        return new String(charArray);
    }

    public static boolean isValidAnargram(String str1, String str2) {
        String sortedString1 = getSortedStringN(str1);
        String sortedString2 = getSortedStringN(str2);
        return sortedString1.equals(sortedString2);
    }

    private static String getSortedStringN(String str) {
        char[] charArray = str.toCharArray();//O(n)
        int[] feq = new int[26]; //O(1) as O(26) constant
        for (char each : charArray)//O(n)
        {
            feq[each - 'a']++;
        }
        StringBuilder sortedKeyBuilder = new StringBuilder();
        for (int x : feq) {
            sortedKeyBuilder.append(x).append("#"); //O(1) as O(26) constant
        }
        return sortedKeyBuilder.toString();
    }

    static void main(String[] args) {
        System.out.println(isValidAnargram_NLogN("anagram", "nagaram"));
        System.out.println(isValidAnargram("anagram", "nagaram"));

    }
}
