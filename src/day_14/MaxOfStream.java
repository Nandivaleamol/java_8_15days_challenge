package day_14;

import java.util.Comparator;
import java.util.stream.Stream;

//Problem Statement 04: Java 8 program to find the Maximum number of a Stream?
public class MaxOfStream {
    public static void main(String[] args) {

        Integer max = Stream.of(1, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println("Max value: "+max);
    }
}
