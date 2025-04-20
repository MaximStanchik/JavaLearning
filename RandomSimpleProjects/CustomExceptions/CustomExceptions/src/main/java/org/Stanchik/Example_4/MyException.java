package org.Stanchik.Example_4;
//некорректное создание своего исключения. так делать нельзя, так как не передаем сообщение об ошибке через конструктор
public class MyException extends Exception {
    public MyException() {
        super();
    }
}
