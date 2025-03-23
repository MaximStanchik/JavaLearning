package org.Stanchik.I;

public class TerminalPaymentService implements Payments{
    @Override
    public void payWebMoney() {
        //logic
    }
    @Override
    public void payCreditCard() {
        //logic
    }
    @Override
    public void payPhoneNumber() {
        //???????
    }
}

// данный класс не может реализовать payPhoneNumber(), и классу данный метод совсем не нужен, но мы его сюда зачем-то пишем. из-за этого нарушается четвертый принцип SOLID I -- Interface Segregation (разделение интерфейсов). Для решения такой проблемы необходимо разделять интерфейсы