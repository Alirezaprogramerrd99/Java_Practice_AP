package Hobys;

class T{
    String name;
    int id;
    int age;
    T(){
        name = "T";
        id = 12345;
        age = 1;
    }
    T(String name){
        this();
        this.name = name;
    }
    T(String name, int id){
        this(name);
        this.id = id;
    }
    T(String name, int id, int age){
        this(name,id);
        this.age = age;
    }

    public void print(){
        System.out.println(this);
    }
}

public class PackgeTest12 {
    public void msg(){
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        T e = new T();
        e.print();
        System.out.println(e);

    }

}
