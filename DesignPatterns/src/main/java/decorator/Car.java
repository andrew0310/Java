package decorator;

public class Car {

    private float speed;
    private String name;
    private int seats;
    public float accelerate;

    public Car(float speed, String name, int seats) {
        this.speed = speed;
        this.name = name;
        this.seats = seats;
        this.accelerate = 2.0f;
    }

    public void start() {
        System.out.println("Starting Car");
    }

    public void sell() {
        System.out.println("Selling the car");
    }

    public void accelerate() {
        speed += accelerate;
        System.out.println("Accelerate your speed 2 m/s");
    }
}
