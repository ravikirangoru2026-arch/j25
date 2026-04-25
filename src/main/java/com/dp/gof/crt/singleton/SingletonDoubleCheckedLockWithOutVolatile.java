package com.dp.gof.crt.singleton;

public class SingletonDoubleCheckedLockWithOutVolatile {

    private static SingletonDoubleCheckedLockWithOutVolatile INSTANCE;

    private SingletonDoubleCheckedLockWithOutVolatile() {
    }

    public static SingletonDoubleCheckedLockWithOutVolatile getInstance() {

        if (INSTANCE == null) {// First check (no lock)
            synchronized (SingletonDoubleCheckedLockWithOutVolatile.class) {
                if (INSTANCE == null) {// Second check (with lock)
                    INSTANCE = new SingletonDoubleCheckedLockWithOutVolatile();
                    // JVM can reorder: memory assigned before constructor completes
                    // Another thread sees non-null but partially constructed object
                }
            }
        }

        return INSTANCE;
    }

    //Version 4 — Double-Checked Locking without volatile (subtle JVM break)
    //Problem: JVM instruction reordering without volatile can expose a partially constructed object.

    // public class
    // private constructor
    // private static final self object with no instantiation
    // public static getInstance() method with 1 null check, then synchronized block at class level then null check again
    // instantiate

}
