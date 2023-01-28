package day_03_oreach_collectors;

import java.util.Arrays;
import java.util.List;

//Day 3:
//Question 01: How do you use the forEach method with a Stream?
public class Question01Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // by using method reference
        System.out.println("----BY USING METHOD REFERENCE----");
        numbers.stream().forEach(System.out::println);

        // by using lambda expression
        System.out.println("----BY USING LAMBDA EXPRESSION----");
        numbers.stream().forEach(p-> System.out.println("Value : "+p));
    }
}
