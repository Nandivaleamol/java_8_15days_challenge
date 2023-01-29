package day_04_predicate_function;

import java.util.Arrays;
import java.util.List;

//Problem statement: print all positive even numbers from the numbers list.
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,-1,-2,-3,-5,-6);

        numbers.stream().filter(n->n>0 && n%2==0).forEach(System.out::println);
    }
}
