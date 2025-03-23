package org.Stanchik.Observers;

import org.Stanchik.Subjects.Subject;

public interface Observer {
    public void update(Subject subject); // метод котоырй должен быть в классе который имплементирует данный интерфейс
};
