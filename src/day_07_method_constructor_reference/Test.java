package day_07_method_constructor_reference;

//Que.01: Write a java 8 program which is have sum() method to calculate sum of two integers (use method reference).
interface Interf{
    void sum(int a, int b);
}
public class Test {
    public void sum(int x, int y){
        System.out.println("Sum : "+(x+y));
    }
    public static void main(String[] args) {
       Test t = new Test();
       Interf i = t::sum;
       i.sum(10,20);
    }
}
