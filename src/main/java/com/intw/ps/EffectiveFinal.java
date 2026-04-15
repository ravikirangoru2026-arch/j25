package com.intw.ps;

public class EffectiveFinal {
    static void main(String[] args) {
        case_p_1();
        case_p_2();
        case_n_1();
        case_n_2();
    }

    private static void case_p_1() {
        final String name = "ravi"; //Explicitly final (old style)
        Runnable r = () -> System.out.println(name); //name is errective final as used in Lambda or anonymous inner class
        Thread t = new Thread(r);
        t.start();
    }

    private static void case_p_2() {
        String name = "ravi"; // Effectively final (Java 8+) — no 'final' keyword, but never reassigned
        Thread t = new Thread(() -> System.out.println(name)); //name is effective final as used in Lambda or anonymous inner class
        t.start();
    }

    private static void case_n_1() {
        String name = "kiran";
        name = "KIRAN";

        String finalName = name;
        Thread t = new Thread(() -> System.out.println(finalName)); //Compile error: name is effective final as used in Lambda or anonymous inner class
        t.start();
    }

    private static void case_n_2() {
        for (int i = 0; i < 5; i++) {
            // 'i' is NOT effectively final — it's modified each iteration
            int index=i;
            new Thread(() -> System.out.println(index)).start(); // Compile error: i should be effective final
        }
    }
}
