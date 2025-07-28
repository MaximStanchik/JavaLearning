package org.Stanchik;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
    private Semaphore sem;
    private boolean full = false;
    private String name;
    Philosopher (Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }
    public void run() {
        try {
            if (!full) {
                sem.acquire();
                System.out.println(name + " садится за стол");

                sleep(3000);
                full = true;

                System.out.println(name + " поел! Он выходит из-за стола");
                sem.release();

                sleep(3000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}

// мьютекс есть у каждого объекта, и манипулировать тааким мьютексом может только JVM, а не разработчик. Мьютекс может захватить только один поток,
// а в случае с семафором используется счетчик потоков, и доступ к ресуру могут получить сразу несколько потоков
// мьютекс -- одноместный семафор или двоичный семафор, так как имеет значеине либо 0 либо 1
