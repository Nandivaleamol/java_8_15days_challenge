package day_06_joda_time_api;
import java.time.LocalTime;
import java.time.ZoneId;

//Que.04: Write a program to get LocalTime object and can call the following methods on that object. getHour(), getMinute(), getSecond(), getNano().
public class LocalTimeMethodsTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();

        System.out.println(time);

        System.out.println("h-m-s-n");
        System.out.printf("%d-%d-%d-%d",h,m,s,n);
        // string
        String timeFormat = "\n"+h+"-"+m+"-"+"-"+s+"-"+n;
        System.out.println(timeFormat);
    }
}
