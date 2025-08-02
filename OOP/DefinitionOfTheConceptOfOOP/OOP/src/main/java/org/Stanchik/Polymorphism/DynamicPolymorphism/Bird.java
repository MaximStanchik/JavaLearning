package org.Stanchik.Polymorphism.DynamicPolymorphism;

class  Bird  extends Animal {
    public  void  eat()  {
        System.out.println("This bird eats seeds."); // переопределили метод из родительского класса в дочернем классе
    }
}