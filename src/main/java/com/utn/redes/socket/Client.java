package com.utn.redes.socket;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Client extends Connection{

    public Client() throws IOException{super("client");}

    public void startClient() {
        try {
            serverOutput = new DataOutputStream(sc.getOutputStream());
            PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            System.out.println("Client "+ sc.getInetAddress()+" connected");
            String inputLine;
            List<String> read = new ArrayList<>();
            while (true) {

                if ((!(inputLine = in.readLine()).equalsIgnoreCase("x"))){
                    System.out.println(sc.getInetAddress() + " says: " + inputLine);
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
            sc.close();
            System.out.println("Client "+sc.getInetAddress()+" disconnected");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
