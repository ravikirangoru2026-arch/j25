package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public final class EMployeeInnutable {
    private final Integer id;
    private final String name;
    private final Map<String, String> pros;

    public EMployeeInnutable(Integer id, String name, Map<String, String> prps) {
        this.id = id;
        this.name = name;
        this.pros = new HashMap<>(prps);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getPros() {
        return new HashMap<>(pros);
    }

}
