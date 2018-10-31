package com.sdacademy.builderexample;

import com.sdacademy.builderexample.pizza.Pizza;
import com.sdacademy.builderexample.pizza.PizzaBuilder;

public class App {

    private static final String REGULAR_PIZZA_HEADER = "Regular pizza";
    private static final String VEGETARIAN_PIZZA_HEADER = "Vegetarian pizza";

    private ConsoleWriter consoleWriter;

    public App(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void start() {
        Pizza regularPizza = new PizzaBuilder().prepareRegularPizza();
        Pizza vegetarianPizza = new PizzaBuilder().prepareVegetarianPizza();

        printPizzaInformation(REGULAR_PIZZA_HEADER, regularPizza);
        printPizzaInformation(VEGETARIAN_PIZZA_HEADER, vegetarianPizza);
    }

    private void printPizzaInformation(String header, Pizza pizza) {
        consoleWriter.println(header);
        consoleWriter.println(pizza.getPriceInformation());
        consoleWriter.println(pizza.getIngredientsInformation());
        consoleWriter.println();
    }

}
