package com.dp.gof.crt.singleton;

public class SingletonBillPush {


    private SingletonBillPush() {
        if (SingletonBillPushHolder.INSTANCE != null) {
            throw new IllegalStateException("Use getInstance()");
        }
    }

    public static SingletonBillPush getInstance() {
        return SingletonBillPushHolder.INSTANCE;
    }

    // Loaded only when getInstance() is called — lazy + thread-safe by JVM
    private static class SingletonBillPushHolder {
        private static final SingletonBillPush INSTANCE = new SingletonBillPush();
    }

    //Why it works: Inner static class is loaded by JVM only when first accessed — JVM guarantees thread-safe class initialization.

    // public class,
    // private static inner class which has super class instantiation as final static variables.
    // public static getInstance method return instace
}
