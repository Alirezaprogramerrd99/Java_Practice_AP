package JavaIoPractice;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Main2 {

    public static void main(String[] args) throws IOException{

        RandomAccessFile accesFile = null;

        try {
            accesFile = new RandomAccessFile("D:\\IOjavaPractice\\text2.txt", "rw");
           // accesFile.seek(4);
            //accesFile.writeBytes("dawdada");
            accesFile.writeBoolean(true);


        }

        catch (IOException e){
            e.printStackTrace();
        }

        finally {
            accesFile.close();
        }

    }
}
