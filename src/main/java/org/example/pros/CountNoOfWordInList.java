package org.example.pros;

import java.util.Arrays;
import java.util.List;

public class CountNoOfWordInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java is pl", "java wora, java , javav8");
        System.out.println(list);
        String searchWord = "java";

        Long no = list.stream().flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(x -> x.equals(searchWord))
                .count();
        System.out.println(no);
    }
}
