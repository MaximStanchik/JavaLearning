package org.Stanchik;

import java.util.concurrent.Semaphore;

public class App
{
    public static void main( String[] args )
    {
        Semaphore sem = new Semaphore(2);
        new Philosopher(sem, "Сократ").start();
        new Philosopher(sem, "Платон").start();
        new Philosopher(sem, "Аристотель").start();
        new Philosopher(sem,"Фалес").start();
        new Philosopher(sem,"Пифагор").start();
    }
}
