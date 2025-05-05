package org.Stanchik;

import static org.Stanchik.CoffeeType.*;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = new Coffee();
        case AMERICANO: {
            coffee = new Americano();
        }
        case CAPPUCCINO: {
            coffee = new Cappuccino();
        }
        case ESPRESSO: {
            coffee = new Espresso();
        }
        case CAFFELATTE: {
            coffee = new CaffeLatte();
        }
    }
}
