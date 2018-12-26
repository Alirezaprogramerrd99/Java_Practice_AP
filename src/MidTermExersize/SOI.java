package MidTermExersize;

import java.util.Scanner;

class StackOfIntegers{

    private int [] elements;
    private int current;
    private static int defaultCapacity = 16;

    StackOfIntegers(){
        this(defaultCapacity);
    }

    StackOfIntegers(int capacity){  // sets capacity of wanted stack of integers.
        elements = new int[capacity];
    }

    boolean isEmpty(){
        if (current == 0)
            return true;
        else return false;
    }

    boolean isFull(){

        if (current == elements.length)
            return true;
        else return false;
    }

    public int peek(){
        if (!isEmpty()) {
            return elements[current - 1];
        }
        else return -1;
    }

    public void push(int integer){
        if (!isFull()) {
            elements[current++] = integer;
        }
        else {
            return;
        }
    }

    public int pop(){
        if (!isEmpty()) {

            int temp = elements[--current];
            elements[current] = 0;

            return temp;
        }
        else return -1;
    }

    public int getSize() {
        return current;
    }

    int []getStack(){
        return elements;
    }

}


public class SOI {

    public static void PrintList(int []a){
        for (int elemnts: a){
            System.out.print(elemnts + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackOfIntegers stack1 = new StackOfIntegers(16);
        int c;
        Scanner s = new Scanner(System.in);
        int input;
        int [] stack = stack1.getStack();
        while (true) {
            if (stack1.isFull())
                System.out.println("stack has been fulled! POP!");

            System.out.println("1- push\n" + "2- pop\n" + "3- peek\n" + "4- get size Of Fulled.");
            c = s.nextInt();
            switch (c) {
                case 1:
                    input = s.nextInt();
                    stack1.push(input);
                    break;

                case 2:
                    System.out.println("removed: " + stack1.pop());
                    break;

                case 3:
                    System.out.println(stack1.peek());
                    break;

                case 4:
                    System.out.println(stack1.getSize());
                    break;
            }

            System.out.println("Stack: ");
            PrintList(stack);
            if (stack1.isFull()) {

                System.out.println("Creating new array!");
                int[] temp = new int[stack1.getSize() * 2];
                System.arraycopy(stack, 0, temp, 0, stack.length);
                stack = null;
                PrintList(temp);
                break;
            }
        }

    }
}
