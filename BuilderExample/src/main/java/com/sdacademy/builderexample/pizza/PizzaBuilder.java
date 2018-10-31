package com.sdacademy.builderexample.pizza;

public class PizzaBuilder {

    private boolean hasSauce;
    private boolean hasCheese;
    private boolean hasHam;
    private boolean hasMushrooms;
    private boolean hasPepperoni;
    private boolean hasOlives;
    private boolean hasTomatoes;

    public PizzaBuilder addSauce() {
        hasSauce = true;
        return this;
    }

    public PizzaBuilder addCheese() {
        hasCheese = true;
        return this;
    }

    public PizzaBuilder addHam() {
        hasHam = true;
        return this;
    }

    public PizzaBuilder addMushrooms() {
        hasMushrooms = true;
        return this;
    }

    public PizzaBuilder addOlives() {
        hasOlives = true;
        return this;
    }

    public PizzaBuilder addPeperoni() {
        hasPepperoni = true;
        return this;
    }

    public PizzaBuilder addTomatoes() {
        hasTomatoes = true;
        return this;
    }

    public Pizza prepare() {
        Pizza pizza = new Pizza();

        pizza.setHasMushrooms(hasMushrooms);
        pizza.setHasOlives(hasOlives);
        pizza.setHasPepperoni(hasPepperoni);
        pizza.setHasHam(hasHam);
        pizza.setHasTomatoes(hasTomatoes);
        pizza.setHasCheese(hasCheese);
        pizza.setHasSauce(hasSauce);

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
