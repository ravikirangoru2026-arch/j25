package org.example.j8.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimpitveStreams {
    public static void main(String[] args) {
        System.out.println("IntStream.ran(1,5): it gives 1 to 4");
        IntStream intStrm = IntStream.range(1, 5);
        intStrm.map(x->x*x).forEach(System.out::println);


        System.out.println("IntStream.rangeClosed(1,5): it gives 1 to 5");
        IntStream intStrm2= IntStream.rangeClosed(1,5);
        intStrm2.map(x->x*x).forEach(System.out::println);


        Random r = new Random();
        DoubleStream dStream =r.doubles(5);
        dStream.forEach(System.out::println);


        System.out.println("\"Ravikiran\".chars()");
        IntStream streamChars= "Ravikiran".chars();
        streamChars.forEach(System.out::println);

        System.out.println("Stream.generate(-)");
        Stream<String> generatedStream = Stream.generate(()-> "ravi").limit(5);
        generatedStream.forEach(System.out::println);


        Stream<Integer> streamIterated= Stream.iterate(1, n->n+n).limit(5);
        streamIterated.forEach(System.out::println);





    }
}
