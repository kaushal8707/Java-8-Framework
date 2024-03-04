package org.java8.framework.Stream.API;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WaysCreatingIntStream {
    public static void main(String[] args) {

        // With Specified Values
        IntStream is1=IntStream.of(12);
        IntStream is2=IntStream.of(1,2,3,4,5);

        // Generating ints in Range
        IntStream is3=IntStream.range(1,5);
        IntStream is4=IntStream.rangeClosed(1,5);

        // Infinite Streams with Iteration
        // The iterator() function is useful for creating infinite streams. Also, we can use this method to produce streams where values are increment by any other value than 1.
        IntStream is5=IntStream.iterate(0, i->i+1).limit(10);
        is5.forEach(a-> System.out.println(a));

        // Infinite Streams with IntSupplier
        IntStream stream = IntStream
                .generate(() -> { return (int)(Math.random() * 10); });
        stream.limit(10).forEach(System.out::println);
        System.out.println("========================================");

        // Filtering the Values
        // We can apply filtering on int values produced by the stream and use them in another function or collect them for further processing.
        IntStream.range(1,10).filter(a->a%2==0).forEach(System.out::println);
        System.out.println("========================================");

        // For example, we can iterate over int values and filter/collect all prime numbers up to a certain limit


       IntStream stream1 = IntStream.range(1, 100);
       stream1.filter(WaysCreatingIntStream::isPrime)
                .boxed()
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }
}
