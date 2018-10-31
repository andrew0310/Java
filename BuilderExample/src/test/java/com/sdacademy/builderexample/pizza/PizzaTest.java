package com.sdacademy.builderexample.pizza;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PizzaTest {

    Pizza pizza;

    @Before
    public void initialize() {
        this.pizza = new Pizza();
    }

    @Test
    public void getIngredientsInformationShouldReturnStringOfIngredients() {
        String ingredientsInformation = pizza.getIngredientsInformation();
        Assert.assertEquals("This pizza doesn't have ingredients.",
                ingredientsInformation);
    }

    @Test
    public void shouldReturnVegetarianPizza() {
        PizzaBuilder pb = new PizzaBuilder();
        PizzaBuilder pb1 = new PizzaBuilder();

        Pizza newPB = pb.addCheese().addMushrooms().addOlives().addSauce().addTomatoes().prepare();

        Assert.assertEquals(newPB, pb1.prepareVegetarianPizza());
    }
}