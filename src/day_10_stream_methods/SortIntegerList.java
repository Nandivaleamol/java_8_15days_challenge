package day_10_stream_methods;
import java.util.Arrays;
import java.util.List;

//Que.01: Sort the given integer list in reverse and natural order and print it. using sort() and forEach() method.
public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,2,6,3,0,5,10,8,9);
        System.out.println("Given list: \n"+integerList);

        System.out.println("\nAfter sorting in reverse order: ");
        integerList.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(s-> System.out.print(s+" "));

        System.out.println("\nAfter natural sorting order: ");
        integerList.stream().sorted().forEach(s-> System.out.print(s+" "));
    }
}
