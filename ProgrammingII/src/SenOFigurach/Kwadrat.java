package SenOFigurach;

import java.util.Random;

public class Kwadrat extends Figura {
    private int bokA;


    public Kwadrat(int bokA) {
        this.bokA = bokA;
    }

    @Override
    public int obwod() {
        return 4 * bokA;
    }

    @Override
    public void generuj() {
        this.bokA = new Random().nextInt(100);
    }
}
