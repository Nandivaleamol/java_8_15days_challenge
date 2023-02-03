package day_09_stream_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Que.01: To convert string lowercase to uppercase and collect  strings from the list using map() and collect().
public class CollectEvenNumbers {
    public static void main(String[] args) {
        List<String> integerList = Arrays.asList("ab","cd","ef","gh","ij","kl");

        List<String> upperCaseStringsList = integerList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseStringsList);
    }
}
