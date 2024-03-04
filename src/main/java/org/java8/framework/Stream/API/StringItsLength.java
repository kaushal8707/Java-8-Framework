package org.java8.framework.Stream.API;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringItsLength {
    public static void main(String[] args) {
        Arrays.asList("abc","dfgvh","aaaaaaaaa")
                .stream()
                .collect(Collectors.toMap(Function.identity(),String::length))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}