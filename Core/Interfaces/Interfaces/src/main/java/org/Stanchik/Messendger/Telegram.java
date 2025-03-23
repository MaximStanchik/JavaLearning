package org.Stanchik.Messendger;

public class Telegram implements Messenger {
    public void sendMessage() {
        System.out.println("Отправка сообщения в Telegram");
    };
    public void getMessage() {
        System.out.println("Принятие сообщения в Telegram");
    };
};
