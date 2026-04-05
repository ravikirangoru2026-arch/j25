package org.example.optnal;


import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainOptional {

    public static void main(String[] args) {

        ThreeConcatable cObj1 = (a1, b1, c1) -> {
            return a1.concat(b1.concat(c1));
        };

        System.out.println(cObj1.concat("A", "B", "C"));
        //System.out.println(cObj1.concat("A", "B", null)); // NullPointerException


        Optional<String> o1= Optional.of("Hello");
        Optional<String> o2 = Optional.empty();
        Optional<String>o3 = Optional.ofNullable(null);


        System.out.println(o1.orElse("Default"));
        System.out.println(o2.orElse("Default"));
        System.out.println(o3.orElse("Default"));

        if(o1.isPresent())
        {
            System.out.println(o1.get());
        }


        Stream<String> strStream=Stream.of("Ravi", "kiran", "Data");
        List<String> upper= strStream.filter(s->s.length()>0).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);

    }
}
