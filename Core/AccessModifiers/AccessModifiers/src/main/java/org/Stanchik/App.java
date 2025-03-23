package org.Stanchik;

import org.Stanchik.abstractClasses.NewClasssssik;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Начиная с "+
        InstanceCounter.getCount() + " экземпляра");
        for (int i = 0; i < 500; ++i) {
            new InstanceCounter();
        }
        System.out.println("Создано " + InstanceCounter.getCount() + " экземмпляров");

        NewClasssssik newClas = new NewClasssssik();
        newClas.showDetails();


    }
}
