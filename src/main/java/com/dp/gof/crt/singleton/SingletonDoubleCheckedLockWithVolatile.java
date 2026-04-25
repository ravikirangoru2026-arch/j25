package com.dp.gof.crt.singleton;

import java.io.Serializable;

public class SingletonDoubleCheckedLockWithVolatile implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    // volatile prevents instruction reordering
    private static volatile SingletonDoubleCheckedLockWithVolatile INSTANCE;

    private SingletonDoubleCheckedLockWithVolatile() {
        // 1. Prevent reflection attack
        if (INSTANCE != null) {
            throw new IllegalStateException("Use getInstance()");
        }
    }

    public static SingletonDoubleCheckedLockWithVolatile getInstance()
    {
        if(INSTANCE == null)// First check (no lock)
        {
            synchronized (SingletonDoubleCheckedLockWithVolatile.class)
            {
                if(INSTANCE==null)// Second check (with lock)
                {
                    INSTANCE=  new SingletonDoubleCheckedLockWithVolatile();
                }
            }
        }
        return INSTANCE;

    }

    //2. Override clone() and throw exception
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // 3. Prevents new instance on deserialization
    protected Object readResolve() {
        return getInstance();
    }

}
