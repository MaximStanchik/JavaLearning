package org.Stanchik.Exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    private static final Exchanger<String> exchanger = new Exchanger<String>();

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer("Producer"));
        Thread consumer = new Thread(new Consumer("Consumer"));

        producer.start();
        consumer.start();

    }

    static class Producer implements Runnable {
        private String name;
        public Producer (String name) {
            this.name = name;
        }
        @Override
        public void run() {
            try {
                String sentData = "Данные от " + this.name;
                System.out.println(this.name + " готовит следующие данные: " + sentData);
                String receivedData = exchanger.exchange(sentData);
                System.out.println(name + " получил: " + receivedData);

                String pidr = exchanger.exchange("Привет, потребитель!");
                System.out.println(this.name + " получил: " + pidr);

                exchanger.exchange(null);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private String name;
        public Consumer (String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                String receivedData = exchanger.exchange("Запрос от " + this.name);
                System.out.println(name + " получил: " + receivedData);

                String pidr = exchanger.exchange("Привет, производитель!");
                System.out.println(this.name + " получил: " + pidr);

                String response = "Ответ от " + name;
                exchanger.exchange(response);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
