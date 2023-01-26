package day_02.stream_filter_map;
import java.util.Optional;

//Day 2:
// Question 02: What is the purpose of the Optional class and when should it be used?
public class Question02Test {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Hello World");
        if (optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("Value is not present.");
    }
}
