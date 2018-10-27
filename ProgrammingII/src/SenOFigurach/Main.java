package SenOFigurach;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WypisywaczFigur wypisywaczFigur = new WypisywaczFigur();

        /*wypisywaczFigur.wypiszFigure(new SenOFigurach.Prostokat(5, 7));
        wypisywaczFigur.wypiszFigure(new SenOFigurach.Trojkat(3, 5, 6));*/

        Sen sen = new Sen();
        sen.dodajDoListy(new Prostokat(2, 3));
        sen.dodajDoListy(new Kwadrat(15));
        sen.dodajDoListy(new Trojkat(12, 14, 17));
        sen.dodajDoListy(new Trapez(2,3,5,6));
        sen.addObserver((new WyswietlaczSnu()));
        sen.snij(20000, 1000);
    }
}
