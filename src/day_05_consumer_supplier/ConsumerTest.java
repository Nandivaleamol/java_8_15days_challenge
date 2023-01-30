package day_05_consumer_supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Write a java 8 program which is filter out the odd numbers and print only even numbers in the list.
public class ConsumerTest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer<Integer> printNum = num -> System.out.print(num + " ");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(printNum);
    }
}
