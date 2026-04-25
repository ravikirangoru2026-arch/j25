package com.dp.gof.crt.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Enum Singleton ✅ Most Effective (Josh Bloch's recommendation)
public enum EnumSingleton {
    INSTANCE;
    private final Connection connection;

    //In Java enums, all constructors are implicitly private —
    // the compiler enforces it. Writing private is redundant, but allowed.

    private EnumSingleton() {
        try {
            this.connection = DriverManager.getConnection("jdbc:postgresql://localhost/db", "user", "pass");
        } catch (SQLException e) {
            throw new RuntimeException("DB connection failed", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void doDbHealthCheck() {
        System.out.println("DB Health Check: success");
    }
    // ✅ Thread-safe by JVM
    // ✅ Serialization-safe (no duplicate on deserialization)
    // ✅ Reflection-safe (JVM prevents enum instantiation)
}


