package day_01.que01_functionalInteface;

@FunctionalInterface
interface Interface{
    int sum(int i1, int i2);
}

public class Main {
    public static void main(String[] args) {
        Interface i = (i1,i2)->i1+i2;
        int sum = i.sum(10, 20);
        System.out.println(sum);
    }
}
