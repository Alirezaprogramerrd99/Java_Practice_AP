package NetworkPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    static ArrayList<ClientHandler> activeClients = new ArrayList<ClientHandler>();
    static int numberOfAciveClients = 0;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(7878);
        Socket clientSocket = null;

        while (true){
            clientSocket = serverSocket.accept();

            DataInputStream clientDataInputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream clientDataOutputStream = new DataOutputStream(clientSocket.getOutputStream());


            ClientHandler clientHandler = new ClientHandler(clientSocket, clientDataOutputStream, clientDataInputStream, "client" + numberOfAciveClients);

            Thread thread = new Thread(clientHandler);
            thread.start();

            activeClients.add(clientHandler);
            numberOfAciveClients++;

        }



    }
}
