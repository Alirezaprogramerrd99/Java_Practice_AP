package JavaIoPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serilize2 {

    public static void main(String[] args) throws IOException{

        FileInputStream file1 = new FileInputStream("D:\\IOjavaPractice\\ObjectSaver.txt");
        ObjectInputStream in = new ObjectInputStream(file1);


        try {
            Student st78 = (Student) in.readObject();
            System.out.println(st78.name);
            System.out.println(st78.age);
            in.close();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getCause());
        }
    }
}
