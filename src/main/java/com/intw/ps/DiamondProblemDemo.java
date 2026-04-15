package com.intw.ps;

interface A {
    default void hello() {
        System.out.println("hello-A");
    }
}

interface D {
    default void hello() {
        System.out.println("hello-D");
    }
}

interface B extends A {
    default void hello() {
        System.out.println("hello-B");
    }
}

interface C extends A {
    default void hello() {
        System.out.println("hello-C");
    }
}


/*
class DemoClass0 implements B,C // Compile Error — ambiguous — which hello() to use?
{
}
*/

class DemoClass1 implements B, C { //Providing concrete:Rule 1 — Classes win over Interfaces
    public void hello() {
        System.out.println("DemoClass1");
    }
}

class DemoClass2 implements A, B //Rule 2 — Most Specific Interface Wins: one interface extends another, the more specific (child) interface wins.
{
//A is parent and B is child: B is most specific.
}

class DemoClass3 implements A, D //Explicitly Override (Mandatory): If two sibling interfaces (neither extends the other) define the same default, the implementing class must override and resolve manually.
{
    @Override
    public void hello() {
        // Option 1: Custom implementation
        System.out.println("--------------");
        System.out.println("Hello from DemoClass3");

        // Option 2: Explicitly delegate to B
        System.out.println("--------------");
        A.super.hello();

        // Option 3: Explicitly delegate to C
        System.out.println("--------------");
        D.super.hello();

        // Option 4: Call both
        System.out.println("--------------");
        A.super.hello();
        D.super.hello();
    }
}

public class DiamondProblemDemo {
    static void main(String[] args) {
        DemoClass1 dc1 = new DemoClass1();
        dc1.hello();

        DemoClass2 dc2 = new DemoClass2();
        dc2.hello();

        DemoClass3 dc3 = new DemoClass3();
        dc3.hello();
    }
}
