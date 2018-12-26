package MidTermExersize;


import java.util.Scanner;
public class Test456 {

    public static void main(String[] args) {

        System.out.println("Enter Second:");
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();

        int minuts = sec / 60;
        int remaningSecs = sec % 60;

        System.out.println("Minuts: " + minuts);
        System.out.println("Remaining seconds is: " + remaningSecs);
        float f = 23;
        double d = 12 + 13;
        System.out.println(f);
        System.out.println(d);

        byte s = 97;
        char c = (char) s;
        int q = 'a';

        int j = 60;
        j = c;


    }
}
