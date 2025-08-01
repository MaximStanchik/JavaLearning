package org.Stanchik.Phaser;

import java.util.ArrayList;
import java.util.concurrent.Phaser;

public class Bus {
    private static final Phaser PHASER = new Phaser(1); // только одна сторона-участник будет выполнять фазы действия
    public static class Passenger extends Thread {
        private int departure;
        private int destination;
        public Passenger(int departure, int destination) {
            this.departure = departure;
            this.destination = destination;
            System.out.println(this + " ждет на остановке № " + this.departure);
        }

        @Override
        public void run() {
            try {
                System.out.println(this + " сел в автобус");
                while (PHASER.getPhase() < destination) {
                    PHASER.arriveAndAwaitAdvance();
                }
                Thread.currentThread().sleep(1);
                System.out.println(this + " покинул автобус");
                PHASER.arriveAndDeregister();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return "Пассажир{" + departure + " -> " + destination + '}';
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();

        for (int i = 1; i < 5; i++) {
            if ((int) (Math.random() * 2) > 0) {
                passengers.add(new Passenger(i, i+1)); // этот пассажир выходит на следующей остановке
            }
            if ((int) (Math.random() * 2) > 0) {
                passengers.add(new Passenger(i, 5)); // этот пассажир выходит на конечной
            }
        }

        for (int i = 0; i < 7; i++) {
            switch(i) {
                case 0: {
                    System.out.println("Автобус выехал из парка");
                    PHASER.arrive();
                    break;
                }
                case 6: {
                    System.out.println("Автобус уехал в парк");
                    PHASER.arriveAndDeregister();
                    break;
                }
                default: {
                    int currentBusStop = PHASER.getPhase();
                    System.out.println("Остановка № " + currentBusStop);

                    for (Passenger p : passengers) {
                        if (p.departure == currentBusStop) {
                            PHASER.register();
                            p.start();
                        }
                    }

                    PHASER.arriveAndAwaitAdvance();
                }
            }
        }
    }



}
