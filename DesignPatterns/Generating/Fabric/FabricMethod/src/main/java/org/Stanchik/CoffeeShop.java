package org.Stanchik;

public class CoffeeShop {
    private final SimpleCoffeeFactory coffeeFactory;
    public CoffeeShop (SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасио");
        return coffee;
    }
}
