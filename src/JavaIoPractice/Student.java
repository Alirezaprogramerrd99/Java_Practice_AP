package JavaIoPractice;

import java.io.*;

public class Student implements Serializable{

    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

 class Serillaize {

    public static void main(String[] args) throws IOException {

        // saving object...
        FileOutputStream f1 = new FileOutputStream("D:\\IOjavaPractice\\ObjectSaver.txt");  //we want to write it.
        ObjectOutputStream saver = new ObjectOutputStream(f1);
        Student st1 = new Student("Alireza", 19);
        saver.writeObject(st1);
        saver.close();

        //------------------------------------
        FileInputStream f2 = new FileInputStream("D:\\IOjavaPractice\\ObjectSaver.txt");
        ObjectInputStream in = new ObjectInputStream(f2);
        try {
            Student sdf = (Student) in.readObject();
            System.out.println(sdf.name);
            in.close();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getException());
        }



    }
}
