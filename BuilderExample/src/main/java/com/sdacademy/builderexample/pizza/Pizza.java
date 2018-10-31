package com.sdacademy.builderexample.pizza;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Pizza {

    private static final String SAUCE = "sauce";
    private static final String CHEESE = "cheese";
    private static final String HAM = "non-soy ham";
    private static final String PEPPERONI = "pepperoni";
    private static final String OLIVES = "olives";
    private static final String TOMATOES = "tomatoes";
    private static final String MUSHROOMS = "mushrooms";

    private static final String PRICE_INFORMATION_PREFIX = "This pizza costs: ";
    private static final String INGREDIENTS_INFORMATION_PREFIX =
            "This pizza has the following ingredients: ";
    private static final String DOT = ".";
    private static final String INGREDIENTS_SEPARATOR = ", ";

    private boolean hasSauce;
    private boolean hasCheese;
    private boolean hasHam;
    private boolean hasPepperoni;
    private boolean hasOlives;
    private boolean hasTomatoes;
    private boolean hasMushrooms;

    Pizza() {
    }

    public String getPriceInformation() {
        return new StringBuilder()
                .append(PRICE_INFORMATION_PREFIX)
                .append(getIngredients().size() * 3.8f)
                .append(DOT)
                .toString();
    }

    public String getIngredientsInformation() {
        //metoda StringUtils.join łączy wszystkie Stringi w liście oddzielając je podanym separatorem,
        // np. lista "aaa bbb ccc" i separator ":::" da następujący wynik "aaa:::bbb:::ccc"
        return new StringBuilder()
                .append(INGREDIENTS_INFORMATION_PREFIX)
                .append(StringUtils.join(getIngredients(), INGREDIENTS_SEPARATOR))
                .append(DOT)
                .toString();
    }

    public boolean isHasSauce() {
        return hasSauce;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public boolean isHasHam() {
        return hasHam;
    }

    public boolean isHasPepperoni() {
        return hasPepperoni;
    }

    public boolean isHasOlives() {
        return hasOlives;
    }

    public boolean isHasTomatoes() {
        return hasTomatoes;
    }

    public boolean isHasMushrooms() {
        return hasMushrooms;
    }

    void setHasSauce(boolean hasSauce) {
        this.hasSauce = hasSauce;
    }

    void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    void setHasHam(boolean hasHam) {
        this.hasHam = hasHam;
    }

    void setHasPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }

    void setHasOlives(boolean hasOlives) {
        this.hasOlives = hasOlives;
    }

    void setHasTomatoes(boolean hasTomatoes) {
        this.hasTomatoes = hasTomatoes;
    }

    void setHasMushrooms(boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
    }

    private List<String> getIngredients() {
        List<String> ingredients = new LinkedList<String>();

        addIf(ingredients, SAUCE, hasSauce);
        addIf(ingredients, CHEESE, hasCheese);
        addIf(ingredients, HAM, hasHam);
        addIf(ingredients, PEPPERONI, hasPepperoni);
        addIf(ingredients, OLIVES, hasOlives);
        addIf(ingredients, TOMATOES, hasTomatoes);
        addIf(ingredients, MUSHROOMS, hasMushrooms);

        return ingredients;
    }

    private void addIf(List list, String item, boolean condition) {
        if (condition) {
            list.add(item);
        }
    }

}
