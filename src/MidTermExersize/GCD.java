package MidTermExersize;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        int n,m;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();

        while (m % n != 0){

            int t = m % n;
            m = n;
            n = t;
        }
        System.out.println(n);


    }
}
