package day_05_consumer_supplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

//Write a java 8 program which is generate a stream of first 10 Fibonacci numbers.
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> fibonacci = new Supplier<Integer>() {
            private int current = 0;
            private int next = 1;
            public Integer get() {
                int prev = current;
                current = next;
                next = prev + current;
                return prev;
            }
        };
        Stream.iterate(fibonacci.get(), n -> n + fibonacci.get())
                .limit(10)
                .forEach(s-> System.out.print(s+" "));
    }
}
