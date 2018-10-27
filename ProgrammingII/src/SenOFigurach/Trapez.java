package SenOFigurach;

import java.util.Random;

public class Trapez extends Figura{
    private int bokA;
    private int bokB;
    private int bokC;
    private int bokD;

    public Trapez(int bokA, int bokB, int bokC, int bokD) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.bokD = bokD;
    }

    @Override
    public int obwod() {
        return bokA + bokB + bokC + bokD;
    }

    @Override
    public void generuj() {
        bokA = new Random().nextInt(100);
        bokB = new Random().nextInt(100);
        bokC = new Random().nextInt(100);
        bokD = new Random().nextInt(100);
    }
}
