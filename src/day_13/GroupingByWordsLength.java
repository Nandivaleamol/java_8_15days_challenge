package day_13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem Statement 04: Write a java program to group the words by length using java 8 features
public class GroupingByWordsLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("i","love","java","programming","world");
        Map<Integer,List<String>> collectedByLength =words.stream().collect(Collectors.groupingBy(String::length));
        collectedByLength.forEach((i,s)-> System.out.println(i+" : "+s));
    }
}
