package org.Stanchik;

import java.io.*;

public class App
{
    public static void main( String[] args )
    {
        TerritoriesInfo territoriesInfo = new TerritoriesInfo("У Испании 6 провинций, у России 10 провинций, у Франции 8 провинций");
        ResourcesInfo resourcesInfo = new ResourcesInfo("У Испании 100 золота, у России 80 золота, у Франции 90 золота");
        DiplomacyInfo diplomacyInfo =  new DiplomacyInfo("Франция воюет с Россией, Испания заняла позицию нейтралитета");

        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(savedGame);
            objectOutputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            savedGame = (SavedGame) objectInputStream.readObject();
            System.out.println(savedGame);
            objectInputStream.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
