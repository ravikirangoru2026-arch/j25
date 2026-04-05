package org.example.j17;

public class InstanceOdDemo {

    static void oldWay(Object obj)
    {
        if( obj instanceof String)
        {
            String s= (String) obj;
            System.out.println(s.toUpperCase());
        }
    }

    static void newWay(Object obj)
    {
        if(obj instanceof String str)
        {
            System.out.println(str.toUpperCase());
        }
    }

    static void main(String[] args) {
        oldWay("Ravi");
        newWay("Ravi");
    }
}
