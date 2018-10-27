package decorator;

public class TirDecorator {

    private Car car;

    public TirDecorator(Car car) {
        this.car = car;
    }

    public void start() {
        this.car.start();
        System.out.println("Dołączam się do ruchu i staję się szeryfem lewego pasa");
    }

    public void accelerate() {
        System.out.println("Używam klaksona do tego aby przestraszyć przechodniów");
        this.car.accelerate();
    }

    public void pack(){
        System.out.println("Wołam cieciów a oni załadują naczepę");
    }
}
