package com.dp.gof.crt.singleton;

public class SingletonEager {
    private static final SingletonEager INSTANCE= new SingletonEager();

    private SingletonEager()
    {

    }

    public static SingletonEager getInstance()
    {
        return INSTANCE;
    }

    //Version 1 — Eager (breaks in nothing, but wastes memory)
    // public class
    // private constructor
    // private static final self object with instantiation
    // public static getInstance() method

    // It wont break singleton but memory wast.
    // Created at class loading — even if never used
}
