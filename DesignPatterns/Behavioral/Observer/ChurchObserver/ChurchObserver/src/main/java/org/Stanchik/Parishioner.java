package org.Stanchik;

public class Parishioner implements Observer{
    private String name;

    public Parishioner(String name, Observable o) {
        this.name = name;
        o.registerObserver(this);
    };
    @Override
    public void update(String newsChurch) {
        System.out.println(name + " узнал новость: " + newsChurch);
    };
};
