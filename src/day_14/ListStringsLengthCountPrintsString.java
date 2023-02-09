package day_14;

import java.util.Arrays;
import java.util.List;

//Problem Statement 03:- Java program to count Strings whose length is greater than 5 in the given list. use java 8.
public class ListStringsLengthCountPrintsString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Welcome","to","java","coding","world");

        stringList.stream().filter(s->s.length()>5).forEach(s -> System.out.print(s+" "));
        long count = stringList.stream().filter(s -> s.length() > 5).count();
        System.out.println("\nString count with greater than 5 characters: "+count);
    }
}
