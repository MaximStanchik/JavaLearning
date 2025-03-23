package org.Stanchik.Example_2;

import org.Stanchik.Example_2.CustomException;

public class NewExample {
    public static void doSomething(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Значение должно быть больше или равно нулю");
        }
    }

    public static void main(String[] args) {
        try {
            doSomething(-5);
        }
        catch(CustomException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
