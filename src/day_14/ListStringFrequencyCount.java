package day_14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Problem Statement 02:- Find the frequency of each word in the given list and
 print only those words which are having count >=2 using JAVA 8 features.

 Input- ["AA", "BB", "AA", "DD","CC","DD"]
 Output- Words having count >=2
        AA
        DD
 */
public class ListStringFrequencyCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA","BB","AA","CC","BB","DD","BB");
        Map<String, Long> wordCountMap = names.stream()
                .filter(word -> Collections.frequency(names, word) >= 2)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Words having count >=2");
        System.out.println(wordCountMap);
    }
}
