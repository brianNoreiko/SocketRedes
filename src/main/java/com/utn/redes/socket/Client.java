package com.utn.redes.socket;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Client extends Connection{

    public Client() throws IOException{super("client");}

    public void startClient() {
        try {
            serverExit = new DataOutputStream(socket.getOutputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Client "+ socket.getInetAddress()+" connected");
            String inputLine;
            List<String> read = new ArrayList<>();
            while (true) {

                if ((!(inputLine = in.readLine()).equals("x"))){
                    System.out.println(socket.getInetAddress() + " says: " + inputLine);
                    read.add(inputLine);
                    System.out.println(read);
                }
                else {
                    System.out.println("Closing client... Bye!");
                    break;
                }
            }
            in.close();
            out.close();
            socket.close();
            System.out.println("Client "+socket.getInetAddress()+" disconnected");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
