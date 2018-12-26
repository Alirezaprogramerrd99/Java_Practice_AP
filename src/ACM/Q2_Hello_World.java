package ACM;

import java.util.Scanner;
public class Q2_Hello_World {

    public static void main(String[] args) {
        int fingers, hands, number1, number2, i = 0, j = 0, k = 0;
        Scanner scanner = new Scanner(System.in);

        fingers = scanner.nextInt();
        hands = scanner.nextInt();
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        int multiply = fingers * hands;

        int sum = number1 + number2;
        if (sum % multiply == 0){
            if (sum / multiply == 0)
                System.out.println(0);
            else
                System.out.println(multiply);

        }
        else
            System.out.println(sum % multiply);

    }
}
