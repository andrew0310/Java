package ZakupyWnuczka;

public class Main {
    public static void main(String[] args) {

        Wnuczek wnuczek = new Wnuczek(new Babcia(new Skarpeta(200)));
        Kino kino = new Kino();
        SklepZButami sklepZButami = new SklepZButami();

        sklepZButami.sprzedajButy(wnuczek);
        kino.sprzedajBilet(wnuczek);
    }
}
