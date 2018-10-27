package abstractFactory;

public interface Factory<T> {
    T getSpecialOfTheDay(DayOfWeek day);
}
