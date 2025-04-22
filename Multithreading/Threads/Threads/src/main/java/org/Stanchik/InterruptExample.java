package org.Stanchik;

public class InterruptExample {
    public static void main(String[] args) {
        Thread worker = new Thread(new Task());
        worker.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.interrupt();
    }
}
