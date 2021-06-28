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
            sc= serverSocket.accept();
            System.out.println("Client online");

            clientOutput = new DataOutputStream(sc.getOutputStream());

            clientOutput.writeUTF("write a message");

            BufferedReader input = new BufferedReader(new InputStreamReader(sc.getInputStream()));

            do {
                clientOutput.flush();
                serverMessage = input.readLine();
                System.out.println(serverMessage);
            }while (!serverMessage.equalsIgnoreCase("x"));

            System.out.println("End of connection");
            serverSocket.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}