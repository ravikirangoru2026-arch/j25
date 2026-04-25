package com.dp.gof.crt.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized INSTANCE;
    private SingletonSynchronized() {
    }

    // Entire method locked — massive bottleneck under high concurrency
    public static synchronized SingletonSynchronized getInstance()
    {
        if(INSTANCE==null)
        {
            INSTANCE= new SingletonSynchronized();
        }
        return INSTANCE;
    }

    // Version 3 — Synchronized (breaks performance)

    //Problem: Synchronization on every call even after instance is created.

    // public class
    // private constructor
    // private static final self object with no instantiation
    // public static synchronized getInstance() method, null check then instantiate
}
