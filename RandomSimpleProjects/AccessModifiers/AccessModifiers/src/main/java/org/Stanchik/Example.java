package org.Stanchik;

public class Example extends Test{
    public void firstMethod () { // видимый для всех

    };
    protected void secondMethod() { //метод доступен для други хклассов в пакете и для подклассов в другом пакете

    }
    void thirdMethod() { // видимый только в пакете (данный метод доступен для других классов в этом пакете)

    }
    private void fourthMethod() { //видимый только для класса

    }
}
