package abstractFactory;

public class AbstractPizzaFactory {

    //id = 1 - Dragon Pizza Restaurant
    //id = 2 - Krokodyl Pizza restaurant
    //default Pizza Restaurant

    public Factory<Pizza> getPizzaFromRestaurant(int id) {
        Factory<Pizza> result;

        switch (id) {
            case 1:
                result = new DragonPizzaFactory();
                break;
            case 2:
                result = new KrokodylPizzaFactory();
                break;
            default:
                result = new PizzaFactory(10.0f);
                break;
        }
        return result;
    }
}
