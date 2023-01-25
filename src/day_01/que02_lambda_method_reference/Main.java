package day_01.que02_lambda_method_reference;

@FunctionalInterface
interface Interface{
    int sum(int i1, int i2);
}
public class Main {
    public static void main(String[] args) {

        // with lambda expression
        Interface lambda = (i1, i2) -> i1+i2;
        int sum = lambda.sum(20, 30);
        System.out.println("Sum by lambda expression: "+sum);

        // with method reference
        Interface method = Integer::sum;
        int sum1 = method.sum(20, 30);
        System.out.println("Sum by method reference: "+sum1);
    }
}
