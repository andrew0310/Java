package Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car( new Eco());
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        System.out.println(car.getEngineWear());

    }
}
