package day_13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/* Problem statement: 02: How to get Even and Odd numbers from list using java 8 features. 2 solution.
    input: [1,2,3,4,5,6]
    output:
    Even Numbers: 2,4,6
    Odd Numbers: 1,3,5
 */
public class EvenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //1st Approach
        System.out.println("-----1st solution----");
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream().filter(n->n%2==1).collect(Collectors.toList());
        System.out.println("Even Numbers: "+evenNumbers);
        System.out.println("Odd Numbers: "+oddNumbers);

        // 2nd Approach
        System.out.println("-----2st solution----");
        Map<Boolean, List<Integer>> resultMap = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        List<Integer> evenNumbers1 = resultMap.get(true);
        List<Integer> oddNumbers1 = resultMap.get(false);

        System.out.println("Even Numbers: "+evenNumbers1);
        System.out.println("Odd Numbers: "+oddNumbers1);

    }
}
