package JavaIoPractice;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws Exception{

        Scanner s = null;
        Formatter write = null;
        try {
            File file = new File("D:\\IOjavaPractice\\tesx3.txt");
            write = new Formatter(file);

            s = new Scanner(file);
           // String next = s.nextLine();
            //System.out.println(next);
            write.format("\nHelp me!!");
            write.flush();


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            s.close();
            write.close();
        }




    }
}
