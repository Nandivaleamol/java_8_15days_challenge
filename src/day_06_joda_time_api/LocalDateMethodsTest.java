package day_06_joda_time_api;

import java.time.LocalDate;

//Que.03: Write a program to  get LocalDate object and  call the following methods
// on that object to retrieve Day,month and year values separately.
public class LocalDateMethodsTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int yyyy = date.getYear();
        int mm = date.getMonthValue();
        int dd = date.getDayOfMonth();

        System.out.println("dd-mm-yyyy");
        System.out.printf("%d-%d-%d",dd,mm,yyyy);
    }
}
