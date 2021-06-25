package com.utn.redes.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server extends Connection{

    public Server() throws IOException{super("server");}    //Constructor for server connection

    public void startServer(){
        try{
            System.out.println("Waiting for connection...");
            socket = serverSocket.accept();
            System.out.println("Client online");

            clientExit = new DataOutputStream(socket.getOutputStream());

            clientExit.writeUTF("Request received and accepted");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while ((serverMessage = input.readLine()) != null){
                System.out.println(serverMessage);
            }

            System.out.println("End of connection");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void stopServer() throws Exception {
        System.out.println("Closing server... Bye!");
        serverSocket.close();
    }
}
