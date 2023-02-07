package day_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Problem Statement 03: Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class FilterCubeList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> filteredNumbers = numbers.stream()
                .map(n -> n*n*n)
                .filter(n -> n>50)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);
    }
}
