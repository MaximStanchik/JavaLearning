package org.Stanchik;

public class App 
{
    public static void test(Animal animal) {
        animal.eat();
    };
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);


        animal.eat();
        dog.eat();

        Animal animal_1 = new Dog();
        //animal_1.bark(); не имеем доступа к этому методу
        dog.bark();

    };
}
