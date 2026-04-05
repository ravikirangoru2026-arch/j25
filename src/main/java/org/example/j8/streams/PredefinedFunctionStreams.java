package org.example.j8.streams;

import java.util.function.*;

public class PredefinedFunctionStreams {
    public static void main(String[] args) {

        Predicate<Integer> p = (i) -> (i > 10) && (i < 20);
        System.out.println(p.test(15));


        Function<String, Integer> f = i -> i.length(); // String::length;
        System.out.println(f.apply("Ravi"));

        Consumer<String> c = i -> System.out.println(i.toUpperCase());
        c.accept("Ravi");

        Supplier<Integer> s = () -> {
            return (int) (Math.random() * 1000);
        };
        System.out.println(s.get());


        //Bi
        BiPredicate<Integer, Integer> bp = (i,j) -> (i+j)%2 ==0;
        System.out.println(bp.test(24,34));

        BiFunction<Integer, Integer, Integer> bf= (i,j) -> i+j;
        System.out.println(bf.apply(10,20));

        BiConsumer<String, String> bc= (i,j)-> System.out.println(i+j);
        bc.accept("Bi","Consumer");



    }
}
