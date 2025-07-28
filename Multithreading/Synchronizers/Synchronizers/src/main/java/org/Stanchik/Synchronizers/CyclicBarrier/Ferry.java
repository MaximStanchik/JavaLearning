package org.Stanchik.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

//Задача:
// Существует паромная переправа. Паром может переправлять одновременно по три автомобиля.
// Чтобы не гонять паром лишний раз, нужно отправлять его, когда у переправы соберется минимум три автомобиля.

public class Ferry {
    private static final CyclicBarrier BARRIER = new CyclicBarrier(3, new FerryBoat()); // три потока и одно задание. когда три потока будут собраны, выполнится задание, а потом потоки будут особождены

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 9; i++) {
            new Thread(new Car(i)).start();
            Thread.currentThread().sleep(400);
        }
    }
    //Задача, которая будет выполнятсья
    public static class FerryBoat implements Runnable {
        @Override
        public void run() {
            try {
                Thread.currentThread().sleep(400);
                System.out.println("Паром переправил автомобиль!");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    //Стороны, которые будут достигать барьера
    public static class Car implements Runnable {
        private int carNumber;
        public Car (int carNumber) {
            this.carNumber = carNumber;
        }
        @Override
        public void run() {
            try {
                System.out.println("Автомобиль с номером " + carNumber + " подъехал к паромной переправе");
                BARRIER.await();
                System.out.println("Автомобиль с номером " + carNumber + " продолжил движение");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
