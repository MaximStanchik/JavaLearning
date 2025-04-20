package org.Stanchik;

public class OuterClass {
    public static void main(String[] args) {
        AnonymousInner anonymousInner = new AnonymousInner() {
            @Override
            public void myMethod() {
                System.out.println("Это пример внутреннего анонимного класса");
            }
        };
        anonymousInner.myMethod();
    }
}
