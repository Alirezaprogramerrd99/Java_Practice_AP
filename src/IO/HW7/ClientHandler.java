package HW7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;


class ExistingUserException extends Exception{

    ExistingUserException(String massage){
        super(massage);
    }
}

public class ClientHandler extends Thread {

    private final DataInputStream input;
    private final DataOutputStream output;
    private String clientInfo;
    private Socket socketClient;
    private String clientUserName;
    private String command;
    private String clientPassWord;
    boolean isLogedIn;
    boolean canRegisterd;

    public String getClientUserName(){
        return clientUserName;
    }

    ClientHandler(Socket socketClient, DataInputStream input, DataOutputStream output, String clientInfo){
        this.output = output;
        this.input = input;
        this.socketClient = socketClient;
        this.clientInfo = clientInfo;

        isLogedIn = true;
    }

    public String getClientInfo(){
        return clientInfo + "\nusername: " + Server.activeClients.get(Server.numberOfClients).clientUserName;
    }

    public static synchronized boolean checkSignedIn(String clientUserName) throws ExistingUserException{  // can be foreach.
        for (int i = 0; i < Server.activeClients.size(); i++){
            if (clientUserName.equals(Server.activeClients.get(i).clientUserName) && clientUserName.equals(Server.activeClients.get(i).canRegisterd == true))
                return true;
        }
        return false;
    }

    @Override
    public void run() {
        /// sever works goes here.
        String received;  // this received String is a 3 Strings 1-comand  2-client username 3-client password.

        while (true){

            try {

                received = input.readUTF();
                String[] splitStr = received.split("-"); // splited with space.

                command = splitStr[0];   // must be in the switch case.
                clientUserName = splitStr[1];
                clientPassWord = splitStr[2];

                if (this.canRegisterd) {
                    output.writeUTF("you successfully registered");
                    Server.numberOfClients++;
                    output.flush();
                }
                else throw new ExistingUserException("this username has already in the system\n");

                if (received.equals("exit") || received.equals("EXIT")) {

                    System.out.println("Client " + this.socketClient + " has loged out.");

                    this.isLogedIn = false;
                    this.socketClient.close();
                    break;
                }

                System.out.println(Server.activeClients.get(Server.numberOfClients - 1).getClientInfo() + " registered");  // writers for sever.

            }

            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        try {

            output.close();
            input.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
