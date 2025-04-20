package org.Stanchik.D.Problem;

import org.Stanchik.D.Problem.Cash;

import java.math.BigDecimal;

public class Shop {
    private Cash cash;
    public Shop(Cash cash) {
        this.cash = cash;
    }
    public void doPayment(Object order, BigDecimal amount){
        cash.doTransaction(amount);
    }
} // это модуль верхнего уровня

// Проблема: тесно связали модуль верхнего уровня и модуль нижнего уровня.
// это плохо, потому что при разработке программы придется придется потом переписывать много кода

//Решение: добавление абстракций