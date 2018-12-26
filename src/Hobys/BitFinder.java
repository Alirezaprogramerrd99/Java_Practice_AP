package Hobys;

import java.util.Scanner;

public class BitFinder {

    public static void main(String[] args) {
        int m, n;
        String binary = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        m = scanner.nextInt();
        System.out.println("Enter n bit you want to show:");
        n = scanner.nextInt();
        binary = Integer.toBinaryString(m);
        System.out.println(binary);
        System.out.println(Integer.parseInt(binary));
        String valueOf = String.valueOf(12);
        // right to left .
        System.out.println(n + " bit of " + m + " is " + binary.charAt(binary.length() - n));

    }
}
