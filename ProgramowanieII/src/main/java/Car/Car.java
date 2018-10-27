package Car;

public class Car {

    private int speed = 0;
    private double engineWear;
    private double brakesWear;
    private double gasReleased;

    private Mode mode;

    public Car(int speed, double engineWear, double brakesWear, double gasReleased, Mode mode) {
        this.speed = speed;
        this.engineWear = engineWear;
        this.brakesWear = brakesWear;
        this.gasReleased = gasReleased;
        this.mode = mode;
    }

    public Car(Mode mode) {
        this.mode = mode;
    }


    public void increaseSpeed() {
        speed += mode.howMuchIncreaseSpeedAcceleration();
        engineWear += mode.whatIsEngineWearAcceleration();
        gasReleased += mode.whatIsGasReleasing();
    }

    public void decreaseSpeed() {
        speed -= mode.howMuchDecreaseSpeed();
        brakesWear += mode.whatIsBreaksWear();
    }

    public double getEngineWear() {
        return engineWear;
    }

    public double getBrakesWear() {
        return brakesWear;
    }

    public double getGasReleased() {
        return gasReleased;
    }
}
