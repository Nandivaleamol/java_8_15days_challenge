package day_06_joda_time_api;

import java.time.Year;
import java.util.Scanner;

//Que.01: Write a program to check the given year is leap year or not.
public class LeapYearTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year Number: ");
        int n = sc.nextInt();
        Year y = Year.of(n);

        // check given year is leap year or not
        String result = y.isLeap()? y+" Year is Leap Year" : y+" Year is Not Leap Year";
        System.out.println(result);
    }
}
