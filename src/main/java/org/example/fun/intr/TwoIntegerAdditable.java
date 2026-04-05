package org.example.fun.intr;

@FunctionalInterface
public interface TwoIntegerAdditable {
    public Integer add(Integer a, Integer b);

    default void desc() {
        System.out.println("This Fun interface add two integers");
    }

    static void details() {
        System.out.println("This Fun interface has one SAM, default and static methods.");
    }
}
