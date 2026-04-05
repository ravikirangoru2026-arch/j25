package org.example.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
    private Integer eid;
    private String name;
    private String addr;

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.getEid(),o.getEid());
    }
}