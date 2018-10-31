package com.sdacademy.builderexample.pizza;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder addSauce() {
        pizza.setHasSauce(true);
        return this;
    }

    public PizzaBuilder addCheese() {
        pizza.setHasCheese(true);
        return this;
    }

    public PizzaBuilder addHam() {
        pizza.setHasHam(true);
        return this;
    }

    public PizzaBuilder addMushrooms() {
        pizza.setHasMushrooms(true);
        return this;
    }

    public PizzaBuilder addOlives() {
        pizza.setHasOlives(true);
        return this;
    }

    public PizzaBuilder addPeperoni() {
        pizza.setHasPepperoni(true);
        return this;
    }

    public PizzaBuilder addTomatoes() {
        pizza.setHasTomatoes(true);
        return this;
    }

    public Pizza prepare() {
        return pizza;
    }

    public Pizza prepareRegularPizza() {
        return this.addSauce()
                .addCheese()
                .addHam()
                .addMushrooms()
                .addPeperoni()
                .addOlives()
                .addTomatoes()
                .prepare();
    }

    public Pizza prepareVegetarianPizza() {
        return this.addSauce()
                .addCheese()
                .addMushrooms()
                .addOlives()
                .addHam()
                .addTomatoes()
                .prepare();
    }
}
