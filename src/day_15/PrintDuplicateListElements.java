package day_15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Problem Statement 03: Print duplicate elements of given integer list

public class PrintDuplicateListElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 4, 6, 6, 7, 8, 2);

        Set<Integer> set = new HashSet<>();
        numbers.stream().filter(n->!set.add(n)).forEach(s-> System.out.print(s+" "));
    }
}
