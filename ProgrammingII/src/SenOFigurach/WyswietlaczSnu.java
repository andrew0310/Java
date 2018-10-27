package SenOFigurach;

import java.util.Observable;
import java.util.Observer;

public class WyswietlaczSnu implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Figura figura = (Figura) arg;
        System.out.println("Przyśniła się figura: " + figura.getClass().getSimpleName() + " o obwodzie: " + figura.obwod());
    }
}
