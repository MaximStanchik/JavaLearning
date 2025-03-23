package org.Stanchik;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Sedan sedan = new Sedan();

        String numbers = "10 20 30 40 50 60";
        Scanner console = new Scanner(numbers);
        int fisrtNum = console.nextInt();
        int secondNum = console.nextInt();

        System.out.println(fisrtNum);
    }
}
