package org.Stanchik.CountDownLatch;

import java.util.concurrent.CountDownLatch;

// Задача:
// Рассмотрим следующий пример. Мы хотим провести автомобильную гонку.
// В гонке принимают участие пять автомобилей. Для начала гонки нужно, чтобы выполнились следующие условия:
// Каждый из пяти автомобилей подъехал к стартовой прямой;
// Была дана команда «На старт!»;
// Была дана команда «Внимание!»;
// Была дана команда «Марш!».
// Важно, чтобы все автомобили стартовали одновременно.

public class Race {
    private static final CountDownLatch START = new CountDownLatch(8); //создали CountDownLatch на 8 условий
    private static final int trackLength = 500000;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <=5; i++) {
            new Thread(new Car(i, (int) (Math.random() * 100 + 50))).start();
            Thread.currentThread().sleep(1000);
        }

        while (START.getCount() > 3) {
            Thread.sleep(100);
        }
        Thread.sleep(1000);
        System.out.println("На старт!");
        START.countDown();

        Thread.sleep(1000);
        System.out.println("Внимание!");
        START.countDown();

        Thread.sleep(1000);
        System.out.println("Марш!");
        START.countDown();
    }
    public static class Car implements Runnable {
        private int carNumber;
        private int carSpeed;
        public Car (int carNumber, int carSpeed) {
            this.carNumber = carNumber;
            this.carSpeed = carSpeed;
        }
        @Override
        public void run() {
            try {
                System.out.println("Автомобиль " + carNumber + " подъехал к стартовой прямой");
                START.countDown();
                START.await();
                Thread.currentThread().sleep(trackLength / carSpeed);
                System.out.println("Автомобиль " + carNumber + " финишировал!");
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
