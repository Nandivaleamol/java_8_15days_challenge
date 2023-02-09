package day_14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Problem Statement 01: Java 8 program to remove the duplicate elements from the list?
public class RemoveDuplicateElementInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,4,2,1);

        List<Integer> uniqueList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
