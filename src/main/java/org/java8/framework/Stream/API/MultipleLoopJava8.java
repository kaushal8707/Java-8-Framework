package org.java8.framework.Stream.API;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleLoopJava8 {
    public static void main(String[] args) {
        List<String> states= Stream.of("punjab","pune","karnataka","kochin","Bihar")
                .collect(Collectors.toList());
        List<String> cities= Stream.of("abc","def","ghi","jkl","mno")
                .collect(Collectors.toList());

        states.stream().filter(a->a.startsWith("p")).forEach(state->{
            cities.stream().forEach(city->{
                System.out.println(state+"     "+city);
            });
        });
    }
}
