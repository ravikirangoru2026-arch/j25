package org.example.dp.stn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Enum Singleton ✅ Most Effective (Josh Bloch's recommendation)
public enum DBConnectionENM {
    INSTANCE;
    private final Connection connection;


    //In Java enums, all constructors are implicitly private —
    // the compiler enforces it. Writing private is redundant, but allowed.

    DBConnectionENM() {
        try {
            this.connection = DriverManager.getConnection("jdbc:postgresql://localhost/db", "user", "pass");
        } catch (SQLException e) {
            throw new RuntimeException("DB connection failed", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }


    /*
├── JVM guarantees single instance — no double-check needed
├── Thread-safe by default — no synchronization code
├── Serialization safe — JVM handles it natively
├── Reflection-proof — can't call private constructor via reflection
└── Simplest code — zero boilerplate
     */
}
