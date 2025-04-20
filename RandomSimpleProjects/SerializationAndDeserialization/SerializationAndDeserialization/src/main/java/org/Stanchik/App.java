package org.Stanchik;

import java.io.*;

public class App
{
    public static void main( String[] args ) throws IOException {
        String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
        String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);

        try {
            FileOutputStream outputStream = new FileOutputStream("info.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(savedGame);
            objectOutputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream inputStream = new FileInputStream("info.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            savedGame = (SavedGame) objectInputStream.readObject();
            System.out.println(savedGame);
            objectInputStream.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
