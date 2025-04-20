package org.Stanchik;

import java.io.*;
import java.net.Socket;

public class GreetingClient
{
    public static void main( String[] args )
    {
        String serverName = args[0];
        int serverPort = Integer.parseInt(args[1]);
        try {
            System.out.println("Подключение к серверу " + serverName + " на порт " + serverPort);
            Socket client = new Socket(serverName, serverPort);

            System.out.println("Просто подключается к " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Привет из " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Сервер ответил " + in.readUTF());
            client.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
