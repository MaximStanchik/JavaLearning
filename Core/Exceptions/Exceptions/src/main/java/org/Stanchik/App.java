package org.Stanchik;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Print print = new Print();
        List<String> list = Arrays.asList("first step", null, "second step");

        for (String s : list) {
            try {
                print.print(s);
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues...");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }

        try {
            throw new MyCustomException("Это мое пользовательское исключение!");
        }
        catch (MyCustomException e) {
            System.out.println("Поймано исключение " + e.getMessage());
        }
    }
}
