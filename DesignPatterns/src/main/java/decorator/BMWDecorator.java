package decorator;

public class BMWDecorator {
    private Car car;

    public BMWDecorator(Car car) {
        this.car = car;
    }

    public void start(){
        this.car.start();
        System.out.println("Odpala radio i mówi, że lubi zupę z buraków");
    }

    public void sell(){
        System.out.println("Jeżdżę starym rzęchem ale go nie sprzedam");
    }

    public void accelerate(){
        this.car.accelerate();
        System.out.println("Poszła uszczelka pod głowicą i nie mogę przyspieszyć");
    }

    public void wiejskiTuning(){
        System.out.println("Dodaje zbyt duży spoiler");
        System.out.println("Dodaje wielki wydech");
        System.out.println("Demontuje migacze");
        System.out.println("Piesek z kiwającą się główką");
        System.out.println("Wieszam choinkę wunderbaum");
        System.out.println("Dodaję pluszowe kostki");
    }
}
