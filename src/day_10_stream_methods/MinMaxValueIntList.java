package day_10_stream_methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Que.02: Find the min and max value of given integer list by using min() and max().
public class MinMaxValueIntList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,2,6,3,5,10,8,9);
        //min value
        Integer min = integerList.stream().min((i1, i2) -> i1 - i2).get();
        System.out.println("Min value: "+min);
        //max value
        Integer max = integerList.stream().max((i1, i2) -> i1 - i2).get();
        System.out.println("Max value: "+max);

        System.out.println("----Other Approaches to get min and max value in integer list ----");
        // other approaches to get min and max value in to integer list
        Integer min1 = integerList.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println("Min value: "+min1);

        Integer max1 = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max value: "+max1);
    }
}
