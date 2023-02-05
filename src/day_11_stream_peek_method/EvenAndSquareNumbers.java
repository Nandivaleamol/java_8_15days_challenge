package day_11_stream_peek_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Que.1: Write a java 8 program for debugging and Logging purposes use peek() method of Stream API.
public class EvenAndSquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> list = numbers.stream()
                .filter(n -> n % 2 == 0)
                .peek(s -> System.out.println("Filtered Even Values: " + s))
                .map(n -> n * n)
                .peek(s -> System.out.println("Square Values: " + s))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
