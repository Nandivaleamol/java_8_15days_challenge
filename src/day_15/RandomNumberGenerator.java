package day_15;

import java.util.Random;
import java.util.Scanner;

// Problem Statement 04:- Write a Java program to print n Random number by using java 8

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N number to generate random numbers: ");
        int n = scan.nextInt();

        Random random = new Random();

        random.ints().limit(n).forEach(System.out::println);
    }
}
