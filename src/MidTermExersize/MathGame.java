package MidTermExersize;

import java.util.Scanner;

public class MathGame {

    public static void main(String[] args) {

        int number1, number2, levels = 0, currectAns = 0;
        long start = System.currentTimeMillis();
        String results = "";
        final int NUMBER_OF_QUESTIONS = 3;
        Scanner input = new Scanner(System.in);

        while (levels < NUMBER_OF_QUESTIONS) {
            number1 = (int)(Math.random() * 41);
            number2 = (int)(Math.random() * 41);

            if (number1 < number2){
                int t = number1;
                number1 = number2;
                number2 = t;
            }

            System.out.println("What is " + number1 + " - " + number2 + " ?");
            int answer = number1 - number2;
            int inputAns = input.nextInt();

            if (inputAns == answer)
                currectAns++;
            results += "\n" + number1 + " - " + number2 + " = " + answer +
                    ((number1 - number2 == inputAns) ? " correct" : " wrong");

            levels++;
        }
        System.out.println(results);
        long endTime = System.currentTimeMillis();
        long fend = (endTime - start)/1000;
        System.out.println("Passed Time: " + fend + "s ");


    }
}
