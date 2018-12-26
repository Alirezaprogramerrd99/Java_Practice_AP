package MidTermExersize;

 class Apple extends Fruit {
     Apple(){
         super("ee");
     }

}

class Fruit {
    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
}


public class TestInharitance {

    public static void main(String[] args) {

        new Apple();

    }
}
