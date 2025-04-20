package org.Stanchik.O;

public class EmailNotification implements NotificationService{
    //public void sendMessage(String typeMessage, String message) {
        //if (typeMessage.equils("email")) {
            //write email
            //use JavaMailSenderAPI
        //}
        //if (typeMessage.equals("sms")) {
            //write sms
            //send sms
        //}
   //} // вот так не надо делать

    // вот так надо:
    @Override
    public void sendMessage(String message) {
        //write email
        //use JavaMailSenderAPI
    }
}
