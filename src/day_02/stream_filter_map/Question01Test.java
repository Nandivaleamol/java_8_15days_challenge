package day_02.stream_filter_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Day 2:
//  Que 01: How do you use the Stream API to filter and map a collection?
public class Question01Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenSquaredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: "+evenSquaredNumbers);
    }
}
