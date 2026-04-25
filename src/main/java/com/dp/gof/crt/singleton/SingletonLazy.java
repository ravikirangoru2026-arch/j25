package com.dp.gof.crt.singleton;

public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }

    // Version 2 — Lazy (Not Thread-Safe)
    // public class
    // private constructor
    // private static final self object with no instantiation
    // public static getInstance() method, null check then instatiate

    // Created only when requested
    // Saves memory if never used
    // Problem: Multiple threads can create multiple instances simultaneously
    // Problem: Race condition — two threads can create two instances.
}
