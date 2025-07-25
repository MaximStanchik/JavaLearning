package org.Stanchik;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntro.Dog;
import springIntro.Person;
import springIntro.Pet;

public class App_3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Person dogPerson = context.getBean("DogPerson", Person.class);
        Person catPerson = context.getBean("CatPerson", Person.class  );

        dogPerson.callYourPet();
        catPerson.callYourPet();

        System.out.println(catPerson.getSurname());
        System.out.println(catPerson.getAge());

        System.out.println(dogPerson.getSurname());
        System.out.println(dogPerson.getAge());

        context.close();
    }
}
