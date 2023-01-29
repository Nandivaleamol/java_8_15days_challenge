package day_04_predicate_function;
import java.util.Arrays;
import java.util.List;

// Problem statement: print the length of each word in the words list.
public class FunctionTest {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "goodbye", "see you later");

        //by using method reference
        System.out.println("Using Method Reference:");
        words.stream().map(String::length).forEach(System.out::println);

        //by using lambda expression
        System.out.println("Using Lambda Expression:");
        words.stream().map(stringLength-> stringLength.length()).forEach(s-> System.out.print(s+" "));
    }
}
