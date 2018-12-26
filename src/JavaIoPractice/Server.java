package JavaIoPractice;

import java.io.IOException;
import java.net.*;
import java.util.Formatter;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException{

        ServerSocket serverSocket;
        serverSocket = new ServerSocket(888);
        Socket fromClient = null;
        Scanner input = null;

        String next;

        try {

            fromClient = serverSocket.accept(); // first must accept then get InputStream and OutPutStream.

            input = new Scanner(fromClient.getInputStream());
            Formatter write = new Formatter(fromClient.getOutputStream());
            Scanner systemIn = new Scanner(System.in);
            System.out.println("connection was successful.");

            do {

                next = input.next();
                System.out.println("client sayed:" + next + "\n");

                System.out.println("sever enter your word.");
                String toClient = systemIn.nextLine();
                write.format(toClient + "\n");
                write.flush();

            }while (!next.contains("exit"));
        }

        catch (IOException e){
            e.printStackTrace();
        }

        finally {

            serverSocket.close();
            fromClient.close();
            input.close();
        }

    }
}
