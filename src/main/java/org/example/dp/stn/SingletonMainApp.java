package org.example.dp.stn;

import java.sql.Connection;

public class SingletonMainApp {
    static void main(String[] args) {

        Connection c1= DBConnectionENM.INSTANCE.getConnection();
        Connection c2= DBConnectionENM.INSTANCE.getConnection();

        System.out.println(c1.hashCode() +"  "+c2.hashCode());
    }
}
