package org.Stanchik;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntro.Pet;

public class App_1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Pet dog = context.getBean("Dog", Pet.class);
        Pet cat = context.getBean("Cat", Pet.class);

        dog.say();
        cat.say();

        context.close();
    }
}
