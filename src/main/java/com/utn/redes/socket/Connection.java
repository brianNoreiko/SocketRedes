package com.utn.redes.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {

    private final int PORTNUMBER = 3000;        //Connection Port
    private final String HOST = "localhost";    //Connection Host
    protected String serverMessage;             //Server messages (received)
    protected ServerSocket serverSocket;        //Server socket
    protected Socket sc;                        //Client socket
    protected DataOutputStream serverOutput, clientOutput;  //Outbound data flow / flujo de datos de salida

    public Connection(String type) throws IOException{  //Constructor
        if(type.equalsIgnoreCase("server")){
            serverSocket = new ServerSocket(PORTNUMBER); //socket for port 3000
            sc = new Socket();                       //socket for client
        }else{
            sc = new Socket(HOST,PORTNUMBER);        //Socket for client in localhost port 3000
        }
    }
}
