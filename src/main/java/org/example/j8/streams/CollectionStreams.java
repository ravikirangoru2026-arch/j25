package org.example.j8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreams {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList("abc", "xyz", "abd");
        Stream<String> strStrem = col.stream();

        Boolean flag= strStrem.anyMatch( x->x.equalsIgnoreCase("abc"));
        System.out.println("anyMatch(-) : "+flag);

        List<String> list = List.of("abc", "xyz", "abd");
        Stream<String> listStram = list.stream();
        listStram.map(x->x.toUpperCase()).forEach(System.out::println);
    }
}
