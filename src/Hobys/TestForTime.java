package Hobys;

import java.util.Scanner;

public class TestForTime {

    public static void main(String[] args) {
        long start = System.currentTimeMillis() / 1000;
        char sign = (char) ((Math.random() * (45 - 43)) + 43);

        if (sign == 44) {
            sign = '-';
        }
        int num1 = (int) (Math.random() * 15);
        int num2 = (int) (Math.random() * 15);
        System.out.println("what is " + num1 + " " + sign + " " + num2 + " ?");
        int result = 0, ans;
        Scanner scanner = new Scanner(System.in);
        ans = scanner.nextInt();

        switch (sign) {

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
        }
        System.out.println("your result is: " + (result == ans));
        long end = System.currentTimeMillis() / 1000;

        long Time = (end - start);
        System.out.println("Collapsed Time of Program: " + Time + "s");
    }
}
