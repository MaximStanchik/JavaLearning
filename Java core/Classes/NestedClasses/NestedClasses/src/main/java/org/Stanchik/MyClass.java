package org.Stanchik;

public class MyClass {
    public void displayMessage(Message m) {
        System.out.println(m.greet() + ", это пример анонимного внутреннего класса в качестве аргумента");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(new Message() { // передача анонимного внутреннего класса как аргумента
            @Override
            public String greet() {
                return null;
            }
        });
    }
}
