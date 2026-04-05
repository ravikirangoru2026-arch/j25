package org.example.j8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        Stream<String> emptyStream = Stream.empty();
        System.out.println(emptyStream);

        //Stream Array-1
        String[] strArray = new String[] {"abc", "xyz", "abg"};
        Stream<String> streamStrArry= Arrays.stream(strArray);
        System.out.println(streamStrArry);

        System.out.println("Stream's forEach with Method reference");
        streamStrArry.forEach(System.out::println);

        Stream<String> streamStrArry2= Stream.of("Abc", "ABC", "XYX", "xyz");
        System.out.println("Stream's forEach with Method reference");
        streamStrArry2.forEach(System.out::println);

    }
}
