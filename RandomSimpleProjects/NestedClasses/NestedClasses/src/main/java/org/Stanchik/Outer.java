package org.Stanchik;

public class Outer {
    static class Nested_Demo { //это статический вложенный класс. когда
        public void my_method() {
            System.out.println("Это вложенный класс");
        }
    }

    class Nested_Demo_1 { // это вложенный класс с модификатором доступа package-private
        public void my_method() {
            System.out.println("Это вложенный класс");
        }
    }

    public static void main(String[] args) {
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_method();

        Outer outer = new Outer();
        Outer.Nested_Demo_1 nested_1 = outer.new Nested_Demo_1();
        nested_1.my_method();
    }
}
