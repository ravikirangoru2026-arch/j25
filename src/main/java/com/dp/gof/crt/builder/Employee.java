package com.dp.gof.crt.builder;

public final class Employee {

    // 5 properties — all final (immutable)
    private final int     id;
    private final String  name;
    private final String  department;
    private final double  salary;
    private final boolean active;

    // Private constructor — only Builder can instantiate
    private Employee(Builder builder) {
        this.id         = builder.id;
        this.name       = builder.name;
        this.department = builder.department;
        this.salary     = builder.salary;
        this.active     = builder.active;
    }

    // Getters only — no setters = fully immutable
    public int     getId()         { return id; }
    public String  getName()       { return name; }
    public String  getDepartment() { return department; }
    public double  getSalary()     { return salary; }
    public boolean isActive()      { return active; }

    @Override
    public String toString() {
        return String.format(
            "Employee{id=%d, name='%s', department='%s', salary=%.2f, active=%b}",
            id, name, department, salary, active
        );
    }

    // ─────────────────────────────────────────
    // Static nested Builder
    // ─────────────────────────────────────────
    public static class Builder {

        // Required
        private final int    id;
        private final String name;

        // Optional — with sensible defaults
        private String  department = "Unassigned";
        private double  salary     = 0.0;
        private boolean active     = true;

        // Required fields enforced via constructor
        public Builder(int id, String name) {
            if (id <= 0)
                throw new IllegalArgumentException("id must be positive");
            if (name == null || name.isBlank())
                throw new IllegalArgumentException("name is required");
            this.id   = id;
            this.name = name;
        }

        public Builder department(String department) {
            if (department == null || department.isBlank())
                throw new IllegalArgumentException("department cannot be blank");
            this.department = department;
            return this;
        }

        public Builder salary(double salary) {
            if (salary < 0)
                throw new IllegalArgumentException("salary cannot be negative");
            this.salary = salary;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        // Validate business rules then construct
        public Employee build() {
            if (salary == 0.0 && active)
                throw new IllegalStateException("Active employee must have a salary");
            return new Employee(this);
        }
    }
}