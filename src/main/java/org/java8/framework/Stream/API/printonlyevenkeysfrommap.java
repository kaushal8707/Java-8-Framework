package org.java8.framework.Stream.API;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class printonlyevenkeysfrommap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        map.entrySet()
            .stream()
            .filter(entry->entry.getKey()%2==0)
            .map(entry->entry.getValue())
            .collect(Collectors.toList())
            .forEach(System.out::println);

    }
}
