package Hobys;

class Parent{
    protected long id;
    protected String name;

    Parent(){
        System.out.println("You called Default constructor of Parent class.");
        id = 567934;
        name = "Father";
    }

    Parent(String name){
        this();
        System.out.println("You called one-arg constructor of Parent class.");
        this.name = name;
    }

    Parent(String name, long id){
        this(name);
        System.out.println("You called two-arg constructor of Parent class.");
        this.id = id;
    }

    public void Talk(){
        System.out.println("I am Parent!");
    }


}

class Child extends Parent{
    int size;
    long id;  // because of Child class has id field too the value is zero or setted value in Child class.

    public void Talk(){
        super.Talk();
        System.out.println("I am Child!");
    }

    Child(){
        super();
        this.id = super.id;
        System.out.println("You called Default constructor of Child class");
    }

    Child(int size, String name, long id){
        super(name, id);
        System.out.println("You called three-args constructor of Child class");
        this.size = size;
    }



}


public class Inharitence {

    public static void main(String []args){
        Child c1 = new Child();
        System.out.println(c1.name);
  /*      Child c2 = new Child(85,"Alireza", 219624);
        c2.Talk();*/
        System.out.println(c1.id);


    }
}
