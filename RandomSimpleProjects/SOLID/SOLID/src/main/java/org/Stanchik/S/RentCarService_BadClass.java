package org.Stanchik.S;

public class RentCarService_BadClass {

    public Car findCar(String carNo) { // найти машину
        //find car by number
        return car;
    }

    public Order orderCar(String carNo, Client client) { // заказ машины
        //client order car
        return order;
    }

    public void printOrder(Order order) { // напечатать заказ
        //print order
    }
    public void getCarInterestInfo(String carType) { // првоерка типа машиын
        if (carType.equals("sedan")) {
            //do some job
        }
        if (carType.equals("pickup")) {
            //do some job
        }
        if (carType.equals("van")) {
            //do some job
        }
    }
    public void sendMessage(String typeMessage, String message) { // отправка соощбения по email
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
    }
}


// так как данный класс отвечает за разные действия, то он нарушает первый принцип разработки программного обеспечения SOLID S -- Single responsibility (принцип единой ответственности)
// Решение: разделить этот класс на несколько и разделить между классами ответственность, чтобы класс мог выполнять только одну определенную задачу. Так и сделаем