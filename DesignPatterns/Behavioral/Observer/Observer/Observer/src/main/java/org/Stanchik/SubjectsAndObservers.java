package org.Stanchik;

import org.Stanchik.Observers.ConcreteObserverA;
import org.Stanchik.Observers.ConcreteObserverB;
import org.Stanchik.Subjects.Subject;

public class SubjectsAndObservers
{
    public static void main( String[] args )
    {
        Subject subject = new Subject();
        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        subject.attach(observerA);
        subject.attach(observerB);

        subject.notifyObservers();

        subject.detach(observerB);
        subject.detach(observerB);
    };
};
