package org.example.collections;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "a");
        hs.put(2, "b");
        hs.put(3, "c");

        hs.entrySet().forEach(System.out::println);
        hs.entrySet().iterator().forEachRemaining(System.out::println);

        hs.put(3, hs.containsKey(3) ? "C" : "c");

        hs.computeIfPresent(1, (k, v) -> v.toUpperCase());
        hs.computeIfAbsent(4, (i) -> "d");

        System.out.println(hs);
        hs.entrySet().iterator().forEachRemaining(x -> System.out.println(x.getKey() + ":" + x.getValue()));
        hs.entrySet().stream().forEach(System.out::println);
        //ConcurrentHashMap;
        //Collections.synchronizedMap();
        //CopyOnWriteArrayList
        //Collections.synchronizedList()

        //CopyOnWriteArraySet
        //Collections.synchronizedSet()
        //Collections.synchronizedSortedSet()
        //Collections.synchronizedSortedMap()
    }
}
