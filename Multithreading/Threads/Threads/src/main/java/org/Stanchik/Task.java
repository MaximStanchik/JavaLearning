package org.Stanchik;

public class Task implements Runnable{
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Работа в потоке");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
