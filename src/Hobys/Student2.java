package Hobys;

import java.io.*;
import java.util.Vector;

 public class Student2 implements Serializable {

    private String name;
    private long id;
    private int age;

    public Student2(String name, long id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

}

 class SerilizeTest {

    public static void main(String[] args) throws IOException {

        Vector<Student2> studentsList = new Vector<Student2>();

        File file1 = new File("D:\\dataStructure\\data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file1, true);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        FileInputStream fileInputStream = new FileInputStream(file1);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        // adding 4 students in the list.
        studentsList.add(new Student2("Alireza", 345522,12));
        studentsList.add(new Student2("Mohsen", 567443,18));
        studentsList.add(new Student2("Sara", 3450943,21));
        studentsList.add(new Student2("Yuoee", 99908,34));

        try {

            outputStream.writeObject(studentsList);
            outputStream.flush();
            System.out.println("data saved.");

        }

        catch (Exception e){
            e.printStackTrace();
        }

        finally {
            outputStream.close();
            fileOutputStream.close();
        }

    }
}
