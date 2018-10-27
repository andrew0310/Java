package abstractFactory;

public class Main {
    public static void main(String[] args) {

        Pizza p = new PizzaFactory(2.5f).getSpecialOfTheDay(DayOfWeek.FRIDAY);

        Pizza fromOrder = new AbstractPizzaFactory().getPizzaFromRestaurant(1).getSpecialOfTheDay(DayOfWeek.MONDAY);
    }
}
