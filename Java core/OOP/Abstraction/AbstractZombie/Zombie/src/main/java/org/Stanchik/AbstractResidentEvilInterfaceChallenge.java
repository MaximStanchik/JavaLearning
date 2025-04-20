package org.Stanchik;

public class AbstractResidentEvilInterfaceChallenge
{
    static int nemesisRaids = 0;
    public static void main( String[] args )
    {
        Zombie zombie = () -> System.out.println("Graw!!! " + nemesisRaids++);
        System.out.println("Nemesis raids: " + nemesisRaids);
        Nemesis nemesis = new Nemesis() {
            @Override
            public void shoot() {
                shoots = 23;
            }
        };

        Zombie.zombie.shoot();
        zombie.shoot();
        nemesis.shoot();
        System.out.println("Nemesis shoots: " + nemesis.shoots + " and raids: " + nemesisRaids);

        int x_1 = 5;
        int y_1 = x_1++;

        System.out.println("x_1: "+ x_1);
        System.out.println("y_1: "+ y_1);

        int x_2 = 5;
        int y_2 = ++x_2;

        System.out.println("x_2: "+ x_2);
        System.out.println("y_2: "+ y_2);

    }
}
