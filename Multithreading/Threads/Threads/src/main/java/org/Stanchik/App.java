package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        new Thread (new HelloRunnable ()).start();
        new Thread (new HelloThread()).start();
    }
}
