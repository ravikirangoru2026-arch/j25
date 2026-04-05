package org.example.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student>{
    private Integer id;
    private String name;
    private String addr;

    @Override
    public int compareTo(Student o) {
        return this.getId().compareTo(o.getId());
    }
}
