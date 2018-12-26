package NetworkPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable {

    final DataInputStream in;  // client data input.
    public String clientusername;
    final DataOutputStream out;
    Socket clientSocket;
    boolean logedIn;
    String dest = null;

    ClientHandler(Socket client, DataOutputStream out, DataInputStream in, String Id) {
        this.in = in;
        this.out = out;
        this.clientSocket = client;
        this.clientusername = Id;

        logedIn = true;
    }



    @Override
    public void run() {

        String recievdTxt;

        while (true) {

            try {

                recievdTxt = in.readUTF();
                String massage;  // other massage from client.
                String[] token = recievdTxt.split("@");
                dest = token[0];
                massage = token[1];

                for (ClientHandler clientHandler : Server.activeClients) {

                    if (clientHandler.clientusername.equals(dest) && clientHandler.clientusername.equals(this.clientusername) && clientHandler.logedIn == true) {
                        clientHandler.out.writeUTF("Client" + this.clientusername + ":\t" + massage);
                        break;
                    }
                }

            } catch (IOException e) {
                e.getMessage();
            }

            if (dest.equals("exit"))
                break;

        }
        try {

            out.close();
            in.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }

}
