package org.Stanchik.Messendger;

public class WhatsApp implements Messenger{
    public void sendMessage() {
        System.out.println("Отправка сообщения в WhatsApp");
    };
    public void getMessage() {
        System.out.println("Принятие сообщения в WhatsApp");
    };
};