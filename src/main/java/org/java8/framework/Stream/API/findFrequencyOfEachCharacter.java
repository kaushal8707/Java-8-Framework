package org.java8.framework.Stream.API;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String input="persistent";
        Arrays.asList(input.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .forEach(entry->{
                    System.out.println(entry.getKey()+" - "+entry.getValue());
                });
    }
}
