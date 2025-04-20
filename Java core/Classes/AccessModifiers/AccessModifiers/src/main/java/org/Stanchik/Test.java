package org.Stanchik;

public class Test {
    final int value = 10;
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Менеджер";
    public void changeValue() {
        //value = 20; // будем получать ошибку
        //TITLE = "Директор"; // будем получать ошибку
    };
    public final void newMethod() { // нельзя переопределить

    };
    public transient int limit = 45;
}

