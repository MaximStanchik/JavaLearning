package org.Stanchik;

public class App
{
    public static void main( String[] args )
    {
        Car bugatti = new Car("Buggati Veyron", 300, 3, 500, "blue", 2004, "Maxim", "Stanchik", 200000, false, 4, "Leather");
        Car bmw = new Car("BMW", 150);
        Cat Barsik = new Cat();
        Cat Shpuntik = new Cat("Shpuntik", 5);

        System.out.println(bugatti.model);
        System.out.println(bmw.model);
    }
}
