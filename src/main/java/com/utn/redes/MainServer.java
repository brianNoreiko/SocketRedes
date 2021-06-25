package com.utn.redes;

import com.utn.redes.socket.Server;

import java.io.IOException;

public class MainServer
{
    public static void main(String[] args) throws IOException
    {
        Server server = new Server();

        System.out.println("Starting server... \n");
        server.startServer();
    }
}