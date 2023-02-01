package day_07_method_constructor_reference;

//Que.02:  Write a java 8 program which is have multiply() method to calculate product of two integers (use static method reference).
interface SumInterf{
    void sum(int a, int b);
}
public class Test02 {
    public static void sum(int i1, int i2){
        System.out.println("Sum: "+(i1+i2));
    }
    public static void main(String[] args) {
        Test02 t = new Test02();
        SumInterf i = Test02::sum;
        i.sum(20,30);
    }
}
