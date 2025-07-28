package org.Stanchik.RaceCondition;

import java.util.concurrent.atomic.AtomicInteger;

public class Scratch {
    static class GlassOfWater {
        private AtomicInteger volume = new AtomicInteger(0);

        public int getVolume() {
            return volume.get();
        }

        public void incrementVolume() {
            volume.incrementAndGet();
        }

        public void setVolume(int volume) {
            this.volume.set(volume);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final GlassOfWater glassOfWater = new GlassOfWater();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                glassOfWater.incrementVolume();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                glassOfWater.incrementVolume();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Volume is " + glassOfWater.getVolume());
    }
}