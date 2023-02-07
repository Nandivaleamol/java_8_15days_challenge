package day_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Problem Statement 01: Java 8 program to perform concatenation on two Streams?
public class ConcatenationOfStreams {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9,0);

        List<Integer> concatenation = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

        System.out.println(concatenation);
    }
}
