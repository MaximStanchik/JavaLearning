package org.Stanchik.Semaphore;

import java.util.concurrent.Semaphore;
// Задача:
//  Существует парковка, которая одновременно может вмещать не более 5 автомобилей.
//  Если парковка заполнена полностью, то вновь прибывший автомобиль должен подождать пока не освободится хотя бы одно место.
//  После этого он сможет припарковаться.

public class Parking {
    private static final boolean[] PARKING_PLACES = new boolean[5];
    private static final Semaphore SEMAPHORE = new Semaphore(5, true);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 7; i ++) {
            new Thread(new Car(i)).start();
            Thread.currentThread().sleep(400);
        }
    }
    public static class Car implements Runnable {
        private int carNumber;
        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            System.out.println("Автомобиль с номером " + carNumber + " подъехал к парковке");
            try {
                SEMAPHORE.acquire();
                int parkingNumber = -1;
                synchronized (PARKING_PLACES) {
                    for (int i = 0; i < 5; i++) {
                        if (PARKING_PLACES[i] == false) {
                            PARKING_PLACES[i] = true;
                            parkingNumber = i;
                            System.out.println("Автомобиль " + carNumber + " припарковался на месте " + i);
                            break;
                        }
                    }
                    Thread.currentThread().sleep(1000);

                    synchronized (PARKING_PLACES) {
                        PARKING_PLACES[parkingNumber] = false;
                    }

                    SEMAPHORE.release();
                    System.out.println("Автомобиль " + carNumber + " покинул парковку");
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
