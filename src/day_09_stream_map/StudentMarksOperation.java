package day_09_stream_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Que.02: Count the how many student are passed and failed from the given marks list
and add 5 grace marks who failed use filter() , map() and count() methods.
(marks<35 = fail and marks>=35= pass)
 */
public class StudentMarksOperation {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(70,39,40,69,30,35,25,27,50,80,50);

        System.out.println("Original Marks List: ");
        marks.forEach(m-> System.out.print(m+" "));

        //counting how many students are failed
        long failedCount = marks.stream().filter(m -> m < 35).count();
        System.out.println("\nTotal Failed Students: "+failedCount);

        //counting how many students are passed
        long passedCount = marks.stream().filter(m-> m>=35).count();
        System.out.println("Total Passed Students: "+passedCount);

        //adding 5 grace marks who failed...
        List<Integer> updatedMarksList = marks.stream().filter(m -> m < 35).map(m -> m + 5).collect(Collectors.toList());
        System.out.println("After adding grace marks list: ");
        updatedMarksList.forEach(m-> System.out.print(m+" "));
    }
}
