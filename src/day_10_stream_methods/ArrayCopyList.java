package day_10_stream_methods;

import java.util.Arrays;
import java.util.List;

//Que.03: To Copy the elements present in the stream into specified array by using toArray().
public class ArrayCopyList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,2,6,3,5,10,8,9);
        //using stream api
        Integer[] intArr = integerList.stream().toArray(Integer[]::new);
        System.out.println("Using stream Api: ");
        Arrays.stream(intArr).forEach(s-> System.out.print(s+" "));

        // 2nd way to copy list to array
        Integer[] intArr1 = integerList.toArray(new Integer[0]);
        System.out.println("\n2nd way to copy array: ");
        Arrays.stream(intArr1).forEach(s-> System.out.print(s+" "));
    }
}
