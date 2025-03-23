package org.Stanchik;

public class MyCustomException extends Exception{
    public MyCustomException(String message) {
        super(message); // вызов конструктура класса Exception
    }
}
