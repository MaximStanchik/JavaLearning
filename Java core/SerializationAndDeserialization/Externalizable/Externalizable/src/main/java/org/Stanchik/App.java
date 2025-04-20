package org.Stanchik;

import java.io.*;

public class App
{
    public static void main( String[] args )
    {
        UserInfo userInfo = new UserInfo("Ivan", "Ivanov", "Ivan Ivanov's passport data");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(userInfo);
            objectOutputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            userInfo = (UserInfo) objectInputStream.readObject();
            System.out.println(userInfo);

            objectInputStream.close();
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
