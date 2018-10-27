package SenOFigurach;

public class WypisywaczFigur {

/*    public SenOFigurach.WypisywaczFigur() {
    }*/

    public void wypiszFigure(Figura figura) {
        System.out.println("Wypisuję figurę o nazwie: " + figura.getClass().getSimpleName() + " oraz obwodzie: " + figura.obwod());
    }
}
