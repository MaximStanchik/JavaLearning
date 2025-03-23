package org.Stanchik;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable{
    private Server server;
    private PrintWriter outMessage;
    private Scanner inMessage;
    private Socket clientSocket = null;
    private static int client_count = 0;
    public ClientHandler (Socket socket, Server server) {
        try {
            client_count = client_count + 1;
            this.server = server;
            this.clientSocket = socket;
            this.outMessage = new PrintWriter(socket.getOutputStream());
            this.inMessage = new Scanner(socket.getInputStream());
        }
        catch (Exception e) {

        }
    }

    public void closeConnection() {
        server.removeClient(this);
        client_count--;
        server.sendMessageToAllClients(client_count+"");
    }

    public void sendMessage(String message) {
        outMessage.println(message);
        outMessage.flush();
    }

    @Override
    public void run() {
        try {
            while(true) {
                server.sendMessageToAllClients("New client connected!");
                server.sendMessageToAllClients(client_count+"");
                break;
            }
            while(true) {
                String clientMessage = inMessage.nextLine();
                if (clientMessage.equals("end")) {
                    break;
                }
                System.out.println(clientMessage);
                server.sendMessageToAllClients(clientMessage);
            }
            Thread.sleep(100);
        }
        catch (Exception e) {

        }

    }
}
