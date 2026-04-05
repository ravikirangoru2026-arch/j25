package org.example.pros;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ravi", "kiran", "raj", "ramarao");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sort:"+list);

        Collections.sort(list, (s1,s2)-> s1.length()-s2.length());
        System.out.println(list);
        Collections.sort(list, (s1,s2)-> (s1.length()>s2.length())?1:-1);
        System.out.println(list);

        Collections.sort(list, (s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(list);

        Collections.sort(list, (s1,s2)->s1.length()>s2.length()?-1:1);
        System.out.println(list);
        Collections.sort(list, (s1,s2)->s2.length()-s1.length());
        System.out.println(list);

        list.sort(Comparator.comparingInt(x->x.length()));
        System.out.println(list);
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);

        List sList=list.stream().sorted((a,b)->b.length()-a.length()).collect(Collectors.toList());
        System.out.println(sList);
    }
}
