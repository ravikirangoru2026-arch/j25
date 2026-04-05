package org.example.pros;

import java.util.Arrays;

public class RemoveDuplicatesIntArray {
    public static void main(String[] args) {
        Integer[] intAry = new Integer[]{1, 2, 4, 3, 2, 1};
        System.out.println(Arrays.toString(intAry));
        Integer[] distIntArry = Arrays.stream(intAry).distinct().toArray(Integer[]::new);
        System.out.println(Arrays.toString(distIntArry));
    }
}
