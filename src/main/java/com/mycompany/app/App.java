package com.mycompany.app;

/**
 * Hello world!
 */

public class App
{

    public App() {}

    public static void main(String[] args) throws Exception {

        // Calculate coffeeA price and print it:
        Coffee coffeeA = new Coffee("dark");
        coffeeA.calculateCoffeePrice(coffeeA);
        System.out.println("Coffee: "+coffeeA.getType() + " - Price: " +coffeeA.getPrice());

        // Calculate coffeeB price and print it:
//        CoffeeWithTaste coffeeB = new CoffeeWithTaste("milk");
//        coffeeB.calculateCoffeePrice(coffeeB);
//        System.out.println("Coffee: "+coffeeB.getType() + " - Price: " +coffeeB.getPrice());
//
//        // Test exception:
//        CoffeeWithTaste coffeeC = new CoffeeWithTaste("blue");
//        coffeeC.calculateCoffeePrice(coffeeC);
//        System.out.println(coffeeC.getPrice());

    }
}
