package com.stanchik.dependencyinjection;

import jakarta.el.BeanNameResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		CarWithSetter carWithSetter = context.getBean(CarWithSetter.class);
		CarWithConstructor carWithConstructor = context.getBean(CarWithConstructor.class);
		Engine engine = context.getBean(Engine.class);

		System.out.println("CarWithSetter: " + carWithSetter);
		System.out.println("CarWithConstructor: " + carWithConstructor);
		System.out.println("Engine: " + engine);
	}
}
