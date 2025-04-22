package org.Stanchik;

public class JoinExample {
    public static void main(String[] args) {
        Thread thread_1 = new Thread(new Task_1("Поток 1"));
        Thread thread_2 = new Thread(new Task_1("Поток 2"));

        thread_1.start();
        thread_2.start();

        try {
            thread_1.join();
            thread_2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все потоки завершены");
    }
}
