package default_methods;

interface ParentA{
    public default void m1(){
        System.out.println("Interface ParentA: Default Method m1()");
    }
    public default void m2(){
        System.out.println("Interface ParentA: Default Method m2()");
    }
}
interface ParentB{
    public default void m1(){
        System.out.println("Interface ParentB: Default Method m1()");
    }
}
class Child implements ParentA,ParentB{
    @Override
    public void m1() {
//        ParentA.super.m1();
        ParentB.super.m1();
    }
}
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
        child.m2();
    }
}
