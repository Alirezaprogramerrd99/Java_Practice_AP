package Hobys;

import java.util.Scanner;

public class Power5 {

    public static void main(String[] args) {

        System.out.println("Enter a:");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();

        System.out.println((long) Math.pow(5, a));
        long number = (long) Math.pow(5, a);

        System.out.println(number % 100);

    }
}
