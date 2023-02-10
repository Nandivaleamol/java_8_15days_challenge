package day_15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Problem Statement 01: Java 8 program to multiply 3 to all element in list and print the list?
public class MultiplyListElements {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> multipliedList = integerStream.map(n -> n * 3).collect(Collectors.toList());
        multipliedList.forEach(s-> System.out.print(s+" "));
    }
}
