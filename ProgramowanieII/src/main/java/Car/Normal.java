package Car;

public class Normal implements Mode {

    public int howMuchIncreaseSpeedAcceleration() {
        return 5;
    }

    public int howMuchDecreaseSpeed() {
        return 5;
    }

    public double whatIsEngineWearAcceleration() {
        return 0.05;
    }

    public double whatIsBreaksWear() {
        return 0.05;
    }

    public double whatIsGasReleasing() {
        return 0.02;
    }
}
