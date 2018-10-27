package abstractFactory;

public class PizzaFactory implements Factory<Pizza> {

    private final float thickness;

    public PizzaFactory(float thickness) {
        this.thickness = thickness;
    }

    public Pizza getSpecialOfTheDay(DayOfWeek day) {
        Pizza result;

        switch (day) {
            case MONDAY:
                result = new Pizza("Soprano", 50.0f, 24.5f, thickness);
                break;
            case TUESDAY:
                result = new Pizza("Capriciosa", 45.0f, 27.0f, thickness);
                break;
            case WEDNESDAY:
                result = new Pizza("Diavolo", 100.0f, 30.0f, thickness);
                break;
            case THURSDAY:
                result = new Pizza("Pepperoni", 43.0f, 32.0f, thickness);
                break;
            case FRIDAY:
                result = new Pizza("Gyros", 45.0f, 33.0f, 2.5f);
                break;
            case SATURDAY:
                result = new Pizza("Wiejska", 47.0f, 35.0f, 2.0f);
                break;
            case SUNDAY:
                result = new Pizza("Hera koka hash LSD", 50.0f, 20.0f, 1.5f);
                break;
            default:
                result = new Pizza("", 0.0f, 0.0f, 0.0f);
                break;
        }
        return result;
    }
}
