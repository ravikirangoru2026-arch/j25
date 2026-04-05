package org.example.classloaders;

public class Load {
    public static void main(String[] args) {
        System.out.println(Load.class.getClassLoader());
        System.out.println(java.lang.String.class.getClassLoader());

        Runtime r = Runtime.getRuntime();

        System.out.println("Processors:" + r.availableProcessors());
        System.out.println("Free memory:" + r.freeMemory());
        System.out.println("Max memory:" + r.maxMemory());
        System.out.println("Total memory:" + r.totalMemory());
    }
}
