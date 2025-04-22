package org.Stanchik;

public class Task_1 implements Runnable {
    private String name;

    public Task_1(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            System.out.println("Работает поток " + name + " !");
            Thread.currentThread().sleep(1000);
            System.out.println("Поток " + name + " завершен!");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
