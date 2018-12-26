package JavaIoPractice;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException{
        FileReader myfileReader = new FileReader("D:\\IOjavaPractice\\text1.txt");  // reading txt codes.
        FileWriter myFileWriter = new FileWriter("D:\\IOjavaPractice\\text1.txt", true);
        int chCode;

        while(( chCode = myfileReader.read()) != -1){ // reads char by char and puts it in to the chCode..
            System.out.print(chCode + "  ");
        }
        myfileReader.close();
        myFileWriter.write("Hello World!!!!!!!");
        myFileWriter.flush();
        myFileWriter.close();

        InputStream is = System.in;
        OutputStream os = System.out;
        ((PrintStream) os).println();


    }
}
