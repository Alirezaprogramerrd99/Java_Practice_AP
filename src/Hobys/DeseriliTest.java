package Hobys;

import java.io.*;
import java.util.Vector;

class Data <Instance>{

    public Vector<Instance> getData(ObjectInputStream input) throws IOException{
        Vector<Instance> instances = null;
        try {

            instances = (Vector<Instance>) input.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
        return instances;
    }
}

public class DeseriliTest {

    public static void main(String[] args) throws IOException , InvalidClassException {

        FileInputStream inputStream = new FileInputStream("D:\\dataStructure\\data.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Vector<Student2> student2;
        Data data = new Data();


        try {

            try {

                    student2 = data.getData(objectInputStream);


                for (Student2 students : student2){
                    System.out.println(students.getName());
                }

            }
            catch (Exception r){
                r.printStackTrace();
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

            inputStream.close();
            objectInputStream.close();
        }
    }
}
