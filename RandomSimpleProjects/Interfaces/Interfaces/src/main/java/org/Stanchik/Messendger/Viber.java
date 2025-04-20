package org.Stanchik.Messendger;

public class Viber implements Messenger {
    public void sendMessage() {
        System.out.println("Отправка сообщения в Viber");
    };
    public void getMessage() {
        System.out.println("Принятие сообщения в Viber");
    };
};

