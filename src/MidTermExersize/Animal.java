package MidTermExersize;

public class Animal {

    public  void run(){
        System.out.println("Animal is running!!");
    }
}

class Cat extends Animal{

    @Override
    public void run(){
        System.out.println("Cat is running!!");
    }
}


class Tester{

    public static void main(String[] args) {
        int a;
        int b;
        int x;
        a = b = x = 10;
        System.out.println(x);


    }
}
