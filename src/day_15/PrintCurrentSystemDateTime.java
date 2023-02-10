package day_15;

import java.time.LocalDateTime;

//Problem Statement 02: Print current date and time in Java 8 Date and Time API?

public class PrintCurrentSystemDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
