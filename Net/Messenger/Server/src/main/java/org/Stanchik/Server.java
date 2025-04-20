package org.Stanchik;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server
{
    private static final int PORT = 4045;
    private ArrayList<ClientHandler> clients = new ArrayList<>();
    public Server() {

            ServerSocket serverSocket = new ServerSocket();
            System.out.println("Сервер запущен...");
            Socket clientSocket = null;

        try {

            while (true) {
                clientSocket = serverSocket.accept();
                ClientHandler client = new ClientHandler(clientSocket, this);
                clients.add(client);
            }
        }
        catch (Exception e) {

        }
        finally {
            clientSocket.close();
            serverSocket.close();
        }
    }

    public void removeClient(ClientHandler clientHandler) {
        clients.remove(clientHandler);
    }

    public void sendMessageToAllClients(String message) {
        for (ClientHandler entry : clients) {
                entry.sendMessage(message);
        }
    }

    public static void main( String[] args )
    {
        Server server = new Server();
    }
}
