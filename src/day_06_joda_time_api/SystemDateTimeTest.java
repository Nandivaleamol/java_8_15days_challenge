package day_06_joda_time_api;

import java.time.LocalDateTime;

//Que.02: Write a  program for to display System Date and time.
public class SystemDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("System Current Date and Time: \n"+dateTime);
    }
}
