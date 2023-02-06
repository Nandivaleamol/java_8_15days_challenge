package day_12_stream_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Que.01: To group a list of names based on their length.
public class GroupNamesByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jim", "James", "Jill");

        Map<Integer, List<String>> groupingByLength = names.stream().collect(Collectors.groupingBy(String::length));

        groupingByLength.forEach((i,s)-> System.out.println(i+" : "+s));
    }
}
