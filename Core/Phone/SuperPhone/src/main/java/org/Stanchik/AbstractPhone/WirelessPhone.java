package org.Stanchik.AbstractPhone;

import org.Stanchik.AbstractPhone.AbstractPhone;

public abstract class WirelessPhone extends AbstractPhone {
    private int hour;
    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
