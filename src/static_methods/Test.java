package static_methods;
import java.util.Arrays;
import java.util.List;

interface MyList {
    static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        MyList.printList(integerList);
    }
}
