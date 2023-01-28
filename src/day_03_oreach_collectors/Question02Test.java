package day_03_oreach_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Day 03:
// Question 02: How do you use the Collectors class to perform a reduction operation on a stream?
public class Question02Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // collecting all even numbers in new list
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers: "+evenNumbers);

        Integer totalSum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Total Sum of all elements: "+totalSum);
    }
}
