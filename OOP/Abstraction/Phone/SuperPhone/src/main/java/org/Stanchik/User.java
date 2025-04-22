package org.Stanchik;

import org.Stanchik.AbstractPhone.AbstractPhone;

public class User {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public void callAnotherUser(int number, AbstractPhone phone) {
        phone.call(number);
    }
}
