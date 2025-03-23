package org.Stanchik.O;

public interface NotificationService {
    public void sendMessage();
}


// таким образом мы не изменяем класс, а просто расширяем функциональность проекта
// иначе будет нарушаться второй принцип разработки ПО SOLID O -- open closed (принцип открытости-закрытости)
