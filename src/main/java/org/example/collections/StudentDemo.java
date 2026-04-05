package org.example.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class StudentDemo {

    static void main(String[] args) {
        Student s1 = new Student(23,"anu", "abc");
        Student s2 = new Student(3,"rav", "fd");
        Student s3 = new Student(39,"bala", "bc");
        Student s4 = new Student(39,"bala", "bc");
        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        System.out.println(hs);

        TreeSet<Student> ts= new TreeSet<>(hs);
        System.out.println(ts);
        TreeSet<Student> ts1 = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        System.out.println(ts1);
    }
}
