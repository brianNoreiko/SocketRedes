package com.utn.redes;


import com.utn.redes.socket.Client;

import java.io.IOException;


public class MainClient {

	public static void main(String[] args) throws IOException {
		Client client = new Client();
		System.out.println("Starting client...");
		client.startClient();


	}

}
