package SenOFigurach;

import java.util.Random;

public class Trojkat extends Figura {

    private int bokA;
    private int bokB;
    private int bokC;

    public Trojkat(int bokA, int bokB, int bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    @Override
    public int obwod() {
        return bokA + bokB + bokC;
    }

    @Override
    public void generuj() {
        bokA = new Random().nextInt(100);
        bokB = new Random().nextInt(100);
        bokC = new Random().nextInt(100);
    }
}
