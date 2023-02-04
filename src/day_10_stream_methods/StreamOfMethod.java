package day_10_stream_methods;

import java.util.stream.Stream;

//Que.04: Apply a stream for group of values and for arrays by using Stream.of() method
public class StreamOfMethod {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(s-> System.out.print(s+" "));
    }
}
