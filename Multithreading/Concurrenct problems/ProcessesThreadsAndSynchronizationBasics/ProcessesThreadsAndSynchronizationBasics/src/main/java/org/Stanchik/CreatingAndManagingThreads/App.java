package org.Stanchik.CreatingAndManagingThreads;

public class App
{
    public static void main( String[] args )
    {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Этот код выполняется в главном потоке!");
    }
}
