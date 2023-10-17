package labs_examples.enumerations.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

enum IceCream {
    VANILLA,
    CHOCOLATE,
    STRAWBERRY,
    MOKKA,
    HAZELNUT
}

enum PizzaTopping {
    PEPPERONI("Pepperoni", 2.50),
    MUSHROOMS("Mushrooms", 1.75),
    ONIONS("Onions", 1.25),
    SAUSAGE("Sausage", 2.00),
    GREEN_PEPPERS("Green Peppers", 1.50);

    private final String toppingName;
    private final double toppingCost;

    PizzaTopping(String name, double cost) {
        this.toppingName = name;
        this.toppingCost = cost;
    }

    public String getToppingName() {
        return toppingName;
    }

    public double getToppingCost() {
        return toppingCost;
    }

}

class PizzaOrder {
    private PizzaTopping topping;
    private int quantity;

    public PizzaOrder(PizzaTopping topping, int quantity) {
        this.topping = topping;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return topping.getToppingCost() * quantity;
    }

    public PizzaTopping getTopping() {
        return topping;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Exercise_01 {
    public static void main(String[] args) {
        List<IceCream> sundae = new ArrayList<>();
        sundae.add(IceCream.VANILLA);
        sundae.add(IceCream.MOKKA);

        for (IceCream scoop : sundae) {
            System.out.println(scoop);
        }

        PizzaOrder order1 = new PizzaOrder(PizzaTopping.GREEN_PEPPERS, 3);
        System.out.println("Order 1:");
        System.out.println("Topping: " + order1.getTopping());
        System.out.println("Quantity: " + order1.getQuantity());
        System.out.println("Total Cost: $" + order1.getTotalCost());
    }
}

