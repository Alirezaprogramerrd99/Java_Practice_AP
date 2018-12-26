package JavaIoPractice;

import java.io.IOException;
import java.net.*;
import java.util.Formatter;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket client = new Socket("localhost", 888);
        Scanner clientIn = null;
        Scanner systemIn = null;
        String next;
        Formatter clientOut = null;

        try {


            clientIn = new Scanner(client.getInputStream());
            clientOut = new Formatter(client.getOutputStream());
            systemIn = new Scanner(System.in);

            do {

                System.out.println("Enter someting client.");
                next = systemIn.nextLine();
                clientOut.format(next + "\n");
                clientOut.flush();

                String massage = clientIn.next();
                System.out.println("Server say: " + massage + "\n");


            }while(!next.contains("exit"));
        }
        catch (IOException e){

            e.printStackTrace();
        }

        finally {
            client.close();
            clientIn.close();
            clientOut.close();
            systemIn.close();
        }

    }
}
