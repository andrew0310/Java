package decorator;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(10.0f, "PussyVagon", 4);

        BMWDecorator bmw = new BMWDecorator(car);
        TirDecorator tir = new TirDecorator(car);

        System.out.println("ACCELERATE");
        car.accelerate();
        bmw.accelerate();
        tir.accelerate();

        System.out.println("START");
        car.start();
        bmw.start();
        tir.start();

        System.out.println("SELL");
        car.sell();
        bmw.sell();

        System.out.println("CUSTOM ACTIONS");
        bmw.wiejskiTuning();
        tir.pack();
    }
}
