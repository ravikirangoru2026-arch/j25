package com.dp.gof.crt.prototype;
public class Main {

    public static void main(String[] args) {

        // ── Create master template ONCE ───────────────────────────
        Document master = new Document(
                "Monthly Report Template",
                "Section 1: Summary\nSection 2: Details\nSection 3: Conclusion",
                "Admin"
        );
        master.addTag("template").addTag("internal");

        System.out.println("\n── Master ──────────────────────────────");
        System.out.println(master);


        // ── Clone 1: April report ─────────────────────────────────
        Document april = master.clone()
                .withTitle("April Report")
                .withAuthor("Priya")
                .withContent("April data here...")
                .addTag("april")
                .publish();

        System.out.println("\n── Clone 1 (April) ─────────────────────");
        System.out.println(april);


        // ── Clone 2: May report ───────────────────────────────────
        Document may = master.clone()
                .withTitle("May Report")
                .withAuthor("Arjun")
                .withContent("May data here...")
                .addTag("may");

        System.out.println("\n── Clone 2 (May) ───────────────────────");
        System.out.println(may);


        // ── Prove deep copy — master untouched ────────────────────
        System.out.println("\n── Master after clones ─────────────────");
        System.out.println(master);

        System.out.println("\n── Deep copy check ─────────────────────");
        System.out.println("Master tags : " + master.getTags()); // [template, internal]
        System.out.println("April  tags : " + april.getTags());  // [template, internal, april]
        System.out.println("May    tags : " + may.getTags());    // [template, internal, may]
        System.out.println("Same list?  : " + (master.getTags() == april.getTags())); // false
    }
}