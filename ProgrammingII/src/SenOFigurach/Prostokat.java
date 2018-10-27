package SenOFigurach;

import java.util.Random;

public class Prostokat extends Figura {

    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB) {

        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public int obwod() {
        return ((2 * bokA) + (2 * bokB));
    }

    @Override
    public void generuj() {
        bokA = new Random().nextInt(100);
        bokB = new Random().nextInt(100);
    }
}
