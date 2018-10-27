package abstractFactory;

public class DragonPizzaFactory implements Factory<Pizza> {
    public Pizza getSpecialOfTheDay(DayOfWeek day) {
        Pizza result;

        switch (day) {
            case MONDAY:
                result = new Pizza("Soprano - DragonPizza", 50.0f, 24.5f, 1.5f);
                break;
            case TUESDAY:
                result = new Pizza("Capriciosa - DragonPizza", 45.0f, 27.0f, 2.0f);
                break;
            case WEDNESDAY:
                result = new Pizza("Diavolo - DragonPizza", 100.0f, 30.0f, 2.2f);
                break;
            case THURSDAY:
                result = new Pizza("Pepperoni - DragonPizza", 43.0f, 32.0f, 1.75f);
                break;
            case FRIDAY:
                result = new Pizza("Gyros - DragonPizza", 45.0f, 33.0f, 2.5f);
                break;
            case SATURDAY:
                result = new Pizza("Wiejska - DragonPizza", 47.0f, 35.0f, 2.0f);
                break;
            case SUNDAY:
                result = new Pizza("Hera koka hash LSD - DragonPizza", 50.0f, 20.0f, 1.5f);
                break;
            default:
                result = new Pizza("", 0.0f, 0.0f, 0.0f);
                break;
        }
        return result;
    }
}
