package Car;

public class Eco implements Mode {

    public int howMuchIncreaseSpeedAcceleration() {
        return 3;
    }

    public int howMuchDecreaseSpeed() {
        return 3;
    }

    public double whatIsEngineWearAcceleration() {
        return 0.01;
    }

    public double whatIsBreaksWear() {
        return 0.01;
    }

    public double whatIsGasReleasing() {
        return 0.01;
    }
}
