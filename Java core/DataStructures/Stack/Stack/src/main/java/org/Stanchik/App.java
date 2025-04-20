package org.Stanchik;

import java.util.EmptyStackException;
import java.util.Stack;

public class App
{
    static void showpush(Stack st, int number) {
        st.push(number);
        System.out.println("Поместить в конец стека (" + number + ")");
        System.out.println("Стек: " + st);
    }
    static void showpop(Stack st) {
        System.out.print("Убрать -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Стек: " + st);
    }
    public static void main( String[] args )
    {
        Stack st = new Stack();
        System.out.println("Стек: " + st);

        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        }
        catch (EmptyStackException e) {
            System.out.println("Пустой стек");
        }

    }
}
