package day_07_method_constructor_reference;

//Que.03: Write a java 8 program which is explain constructor reference.
class Sample{
    String s;
    public Sample(String s){
        this.s = s;
        System.out.println("Constructor Executed: "+s);
    }
}
interface ConstructorInterf{
    public Sample get(String s);
}
public class Test03 {
    public static void main(String[] args) {
      ConstructorInterf interf = Sample::new;
      interf.get("From Constructor Reference");
    }
}
