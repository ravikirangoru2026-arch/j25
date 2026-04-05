package org.example.j17;

import java.util.Random;
import java.util.Spliterator;
import java.util.SplittableRandom;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class RanDomNbrDemo {
    static void main(String[] args) {

        SplittableRandom sr= new SplittableRandom();

        System.out.println(sr.nextInt());
        System.out.println(sr.nextLong());
        System.out.println(sr.nextBoolean());
        System.out.println(sr.nextInt(1,5));
        System.out.println(sr.nextLong(1,10));
    }
}
