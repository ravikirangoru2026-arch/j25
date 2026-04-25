package com.dp.gof.crt.prototype;

import java.util.ArrayList;
import java.util.List;

public class Document implements Cloneable {

    private String       title;
    private String       content;
    private String       author;
    private List<String> tags;
    private boolean      published;

    // ── Full constructor — "expensive" creation ──────────────────
    public Document(String title, String content, String author) {
        System.out.println(">>> Creating new Document from scratch: " + title);
        this.title     = title;
        this.content   = content;
        this.author    = author;
        this.tags      = new ArrayList<>();
        this.published = false;
    }

    // ── Copy constructor — deep clone ────────────────────────────
    private Document(Document source) {
        this.title     = source.title;
        this.content   = source.content;
        this.author    = source.author;
        this.tags      = new ArrayList<>(source.tags); // deep copy
        this.published = source.published;
    }

    @Override
    public Document clone() {
        System.out.println(">>> Cloning Document: " + this.title);
        return new Document(this);
    }

    // ── Fluent setters for post-clone tweaks ─────────────────────
    public Document withTitle(String title)     { this.title = title;         return this; }
    public Document withContent(String content) { this.content = content;     return this; }
    public Document withAuthor(String author)   { this.author = author;       return this; }
    public Document publish()                   { this.published = true;      return this; }
    public Document addTag(String tag)          { this.tags.add(tag);         return this; }

    // ── Getters ──────────────────────────────────────────────────
    public String       getTitle()  { return title;     }
    public List<String> getTags()   { return tags;      }

    @Override
    public String toString() {
        return String.format(
            "Document{title='%s', author='%s', published=%b, tags=%s, content='%s'}",
            title, author, published, tags, content
        );
    }
}