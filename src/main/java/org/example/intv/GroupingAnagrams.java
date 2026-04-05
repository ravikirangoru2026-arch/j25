package org.example.intv;

import java.util.*;

public class GroupingAnagrams {

    static List<List<String>> groupedAnargams_N_KLongK(String[] ar) {
        Map<String, List<String>> hs = new HashMap<>();

        for (String eachElement : ar) {
            char[] sortedChars = eachElement.toCharArray();
            Arrays.sort(sortedChars);
            String sortedKey = new String(sortedChars);
            hs.computeIfAbsent(sortedKey, k -> new ArrayList<String>()).add(eachElement);
            //hs.computeIfAbsent()
            //hs.computeIfPresent()
            //hs.putIfAbsent()

        }
        return new ArrayList<>(hs.values());
        //Time : O(n k log k)
        //Space: O(n k)
    }

    static List<List<String>> groupedAnargams_NK(String[] ar) {
        Map<String, List<String>> hs = new HashMap<>();

        for (String eachElement : ar) {
            int[] feq = new int[26];
            for (char eachCar : eachElement.toCharArray()) {
                feq[eachCar - 'a']++;
            }
            StringBuilder sortedKeyBuilder = new StringBuilder();
            for (int eachCount : feq) {
                sortedKeyBuilder.append(eachCount).append("#");
            }
            String sortedKey = sortedKeyBuilder.toString();
            hs.computeIfAbsent(sortedKey, k -> new ArrayList<String>()).add(eachElement);
        }
        return new ArrayList<>(hs.values());
        //Time : O(n k)
        //Space: O(n k)
    }

    static void main(String[] args) {

        String[] ar = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupedAnargams_N_KLongK(ar));
        System.out.println(groupedAnargams_NK(ar));

    }
}
