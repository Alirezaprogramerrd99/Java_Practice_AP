package HW7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server { // sever side program..

    static Vector<ClientHandler> activeClients = new Vector<ClientHandler>();
    static int numberOfClients = 0;

    public static boolean checkSignedIn(ClientHandler newClientHandler) throws ExistingUserException{  // can be foreach.
        for (ClientHandler clientHandler : activeClients){
            if (clientHandler.getClientUserName().equals(newClientHandler.getClientUserName()) && clientHandler.canRegisterd)
                return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(4444);
        Socket clientSoc = null;
        DataInputStream clientToServerInput = null;
        DataOutputStream severToClientOutput = null;

            while (true) {

                try {

                    clientSoc = server.accept();
                    System.out.println("connection was successful.");

                    clientToServerInput = new DataInputStream(clientSoc.getInputStream());
                    severToClientOutput = new DataOutputStream(clientSoc.getOutputStream());

                    ClientHandler clientHandler = new ClientHandler(clientSoc, clientToServerInput, severToClientOutput, "\nclient: " + numberOfClients);

                    if (!checkSignedIn(clientHandler)) {

                        Thread handlerThread = new Thread(clientHandler);

                        handlerThread.start();
                        activeClients.add(clientHandler);
                        clientHandler.canRegisterd = true;
                       // numberOfClients++;

                    }

                    else {
                        clientHandler.canRegisterd = false;
                        throw new ExistingUserException("this username has already in the system\n");
                    }

                   // handlerThread.join();
                    //clientSoc = null;
                }

                catch (Exception e){
                    System.out.println(e.getMessage());
                    server.close();
                    clientSoc.close();
                    clientToServerInput.close();
                    severToClientOutput.close();

                }

            }
        }

    }

