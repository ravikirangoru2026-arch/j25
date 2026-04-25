package com.dp.gof.crt.builder;

public class Main {

    public static void main(String[] args) {

        // ── Full build (all 5 fields set) ──────────────────────────
        Employee senior = new Employee.Builder(101, "Priya Sharma")
                .department("Engineering")
                .salary(120000.00)
                .active(true)
                .build();

        System.out.println(senior);
        // Employee{id=101, name='Priya Sharma', department='Engineering',
        //          salary=120000.00, active=true}


        // ── Minimal build (only required fields) ───────────────────
        // department → "Unassigned", salary → 0.0, active → true (defaults)
        // BUT active=true + salary=0.0 triggers business rule → must deactivate
        Employee contractor = new Employee.Builder(102, "Arjun Mehta")
                .department("Consulting")
                .salary(85000.00)
                .active(true)
                .build();

        System.out.println(contractor);
        // Employee{id=102, name='Arjun Mehta', department='Consulting',
        //          salary=85000.00, active=true}


        // ── Inactive employee (salary = 0 is valid when inactive) ──
        Employee inactive = new Employee.Builder(103, "Riya Patel")
                .department("HR")
                .salary(0.0)
                .active(false)
                .build();

        System.out.println(inactive);
        // Employee{id=103, name='Riya Patel', department='HR',
        //          salary=0.00, active=false}


        // ── HOW IT BREAKS — all 4 scenarios ───────────────────────

        // Break 1: invalid id (required field check in Builder constructor)
        try {
            new Employee.Builder(-1, "Test User").build();
        } catch (IllegalArgumentException e) {
            System.out.println("Break 1 → " + e.getMessage());
            // Break 1 → id must be positive
        }

        // Break 2: blank name (required field check in Builder constructor)
        try {
            new Employee.Builder(104, "  ").build();
        } catch (IllegalArgumentException e) {
            System.out.println("Break 2 → " + e.getMessage());
            // Break 2 → name is required
        }

        // Break 3: negative salary (optional field validation)
        try {
            new Employee.Builder(105, "Tom")
                    .salary(-5000)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Break 3 → " + e.getMessage());
            // Break 3 → salary cannot be negative
        }

        // Break 4: business rule — active employee with zero salary
        try {
            new Employee.Builder(106, "Jane")
                    .department("Finance")
                    .salary(0.0)   // forgot to set salary
                    .active(true)  // but marked active
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Break 4 → " + e.getMessage());
            // Break 4 → Active employee must have a salary
        }
    }
}