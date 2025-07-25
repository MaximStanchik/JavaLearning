package org.Stanchik.Filtration;

import java.util.stream.Stream;

public class Filtration {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.forEach(s->System.out.println(s));
        citiesStream.forEach(System.out::println);
        citiesStream.filter(s->s.length() == 6).forEach(s->System.out.println(s));

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000), new Phone("Samsung Galaxy S 6", 40000));
        phoneStream.filter(p->p.getPrice()<50000).forEach(p->System.out.println(p.getName()));

        phoneStream.map(p->p.getName()).forEach(s->System.out.println(s));
        phoneStream.map(p-> "название: " + p.getName() + " цена: " + p.getPrice()).forEach(s->System.out.println(s));

        phoneStream.flatMap(p->Stream.of(String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
        ))
    .forEach(s->System.out.println(s));

    }
}
