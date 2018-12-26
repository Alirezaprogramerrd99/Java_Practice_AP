package MidTermExersize;

public class RandomPractice {

    public static void main(String[] args) {
        int number = (int)(Math.random()* (11 - 5)) + 5;
        int number2 =  5 + (int)(Math.random() * 6); // a to (a+b) - 1.
        System.out.println(number);
        System.out.println(number2);
    }
}
