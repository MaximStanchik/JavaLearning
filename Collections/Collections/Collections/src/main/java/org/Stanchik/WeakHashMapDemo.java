package org.Stanchik;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    private static Map map;
    public static void main(String[] args) {
        map = new WeakHashMap();
        map.put(new String("Брест"), "Минск");

        Runnable runner = new Runnable() {
            public void run() {
                while (map.containsKey("Брест")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Ожидание потока");
                    System.gc();
                }
            }
        };
        Thread t = new Thread(runner);
        t.start();
        System.out.println("Главное ожидание");
        try {
            t.join();
        }
        catch (InterruptedException ignored) {

        }

    }
}
