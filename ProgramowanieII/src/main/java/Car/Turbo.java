package Car;

public class Turbo implements Mode {

    public int howMuchIncreaseSpeedAcceleration() {
        return 10;
    }

    public int howMuchDecreaseSpeed() {
        return 10;
    }

    public double whatIsEngineWearAcceleration() {
        return 0.1;
    }

    public double whatIsBreaksWear() {
        return 0.1;
    }

    public double whatIsGasReleasing() {
        return 0.05;
    }

}
