package org.Stanchik;

import org.Stanchik.AbstractPhone.AbstractPhone;

public class ThomasEdisonPhone extends AbstractPhone {
    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputMumber) {
        System.out.println("Телефон звонит");
    }
}
