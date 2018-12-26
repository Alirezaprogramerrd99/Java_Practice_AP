package Hobys;


import java.util.Scanner;

public class SwapTest {
     int number1;
     int number2;

   public SwapTest(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;

    }

    public int getNumber1(){
        return number1;
    }

    public int getNumber2(){
        return number2;
    }

    public static void swapNumbers(SwapTest s){

        int temp = s.number2;
        s.number2 = s.number1;
        s.number1 = temp;
    }





    public static void main(String[] args) {
        System.out.println("Enter two numbers to swap.");
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        SwapTest swap = new SwapTest(a, b);
        System.out.println("a: " + swap.getNumber1() + "\nb: " + swap.getNumber2());
        swap.swapNumbers(swap);
        System.out.println("After swap.");
        System.out.println("a: " + swap.getNumber1() + "\nb: " + swap.getNumber2());

    }
}
