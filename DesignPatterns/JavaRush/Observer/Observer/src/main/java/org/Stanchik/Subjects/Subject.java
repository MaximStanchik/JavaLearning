package org.Stanchik.Subjects;

import org.Stanchik.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>(); // список для хранения наблюдателей

    public void attach (Observer observer) { // метод для добавления нового наблюдателя
        this.observers.add(observer); // добавление нового наблюдателя
    };
    public void detach(Observer observer) { // метод для удаления наблюдателя
        this.observers.remove(observer); // удаление наблюдателя
    };
    public void notifyObservers() { // метод для уведомления всех зарегестрированных наблюдателей
        for (Observer observer : this.observers) { // проход по каждому наблюдателю в списке
            observer.update(this); // обновляем каждый наблюдатель
        };
    };
}
