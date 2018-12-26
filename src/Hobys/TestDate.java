package Hobys;

import java.util.Date;

class Person2{

    private String name;
    private Date Birthday;
    private int age;
    Person2(String name, int age){
        Birthday = new Date(10);
        this.name = name;
        this.age = age;
    }

    public Date getBirthday(){
        return Birthday;
    }

    public String getName(){return name;}
}

public class TestDate {

    public static void main(String[] args) {

        Person2 p1 = new Person2("Alireza", 19);
        System.out.println(p1.getBirthday());

    }
}
