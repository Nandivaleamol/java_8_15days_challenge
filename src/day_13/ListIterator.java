package day_13;
import java.util.Arrays;
import java.util.List;

//Problem Statement 05: Java 8 program to iterate a Stream using the forEach method?
public class ListIterator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("I","Love","Java","Programming","World");
        strings.forEach(System.out::println);
    }
}
