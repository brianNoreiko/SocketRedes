package com.utn.redes.socket;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class Client extends Connection{

    public Client() throws IOException{super("client");}

    public void startClient() {
        Scanner scanner = new Scanner(System.in);
        try {
            serverOutput = new DataOutputStream(sc.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
            System.out.println("Client "+ sc.getInetAddress()+" connected");
            String inputLine="";
            List<String> read = new ArrayList<>();
            while (!inputLine.equalsIgnoreCase("x")) {
                System.out.println("Escribir Mensaje: ");
                inputLine=scanner.nextLine();
                out.println(inputLine);
                read.add(inputLine);
                System.out.println(in.readLine());
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