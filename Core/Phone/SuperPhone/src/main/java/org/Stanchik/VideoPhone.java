package org.Stanchik;

import org.Stanchik.AbstractPhone.AbstractPhone;

public class VideoPhone extends AbstractPhone {
    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Подклюаю видеоканал для абонента " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("У вас входящий видеовызов..." + inputNumber);
    }
}
