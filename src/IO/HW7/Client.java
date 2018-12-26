package HW7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("localhost", 4444);
        Scanner consoleInput = new Scanner(System.in);
        DataInputStream input = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

        System.out.println("Enter Register to reagister user:");

        Thread sendMassage = new Thread(() ->{
            while(true){

                String massage = consoleInput.nextLine();
                try {

                    output.writeUTF(massage + "\n");
                    output.flush();
                }

                catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }

        });

        Thread readMassage = new Thread(() ->{

            while(true) {
                try {

                    String massage = input.readUTF();
                    System.out.println(massage + "\n");
                }

                catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }

        });

        sendMassage.start();
        readMassage.start();
    }
}
