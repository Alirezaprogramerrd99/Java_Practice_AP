package MidTermExersize;

public class PrimeNumber {

    public static boolean isPrime(int number){
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0)
                return false;

        }
        return true;
    }

    public static void printPrimeNumbers(int numebrOfPrimes) {
        final int NUMBERS_PER_LINES = 10;
        int counter = 0;
        int number = 2;

        while (counter < numebrOfPrimes) {

            if (isPrime(number)) {
                counter++;

                if (counter % NUMBERS_PER_LINES == 0) {
                    System.out.println(number + " ");
                } else
                    System.out.print(number + " ");

            }
            number++;
        }
    }

/*
    public static double max(double a, double b){
        return (a > b) ? a : b;

    }
    public static double max(double a, double b, double c){
        return (max(a , b) < c) ? c : max(a , b);
    }

    public static double max(int a, int b, int c, int d){
        return ((max(a, b, c)) < d) ? d : max(a, b, c);
    }

*/

    public static void main(int a){
        System.out.println( "\n" + a);
    }

    public static void main(double a, double b){
        System.out.println(a + "  " + b);
    }

    public static void main(String[] args) {
/*        System.out.println(isPrime(5));

        printPrimeNumbers(15);
        main(12);
        main(89,44);
        System.out.println(max(12,70,19));
        System.out.println(max(12,100,3,45));*//*
        System.out.println(max(1,3.4));
        System.out.println(max(10,5.1));
        System.out.println(get(12));*/

        for (int i = 0; i < 3; i++){
            System.out.println("dede");
        }



    }
    public static double get(int num){
        return num;

    }


    public static double max(int num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

}
