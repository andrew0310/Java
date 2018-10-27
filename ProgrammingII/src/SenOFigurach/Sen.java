package SenOFigurach;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

public class Sen extends Observable {

    private Random r = new Random();
    private List<Figura> listaFigur = new ArrayList<>();

    public void dodajDoListy(Figura figura) {
        listaFigur.add(figura);
    }

    public void snij(long czasTrwaniaSnu, long odstepMiedzyFigurami) throws InterruptedException {

        Instant teraz = Instant.now();
        Instant zaIlesSekundOdTeraz = teraz.plusMillis(czasTrwaniaSnu);

        while (zaIlesSekundOdTeraz.isAfter(teraz)) {
            Thread.sleep(odstepMiedzyFigurami);
            Figura figura = listaFigur.get(r.nextInt(listaFigur.size()));
            this.setChanged();
            this.notifyObservers(figura);
            // teraz = Instant.now();

            zaIlesSekundOdTeraz = zaIlesSekundOdTeraz.minusMillis(odstepMiedzyFigurami);
        }
    }
}

