package org.example.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LimitFibo {
    public static void main(String[] args) {
        IntStream stream = Stream.iterate(new int[]{0,1}, a -> new int[]{a[1], a[0]+a[1]}).mapToInt(a -> a[0]);
        stream.limit(20).forEach(System.out::println);
    }
}
