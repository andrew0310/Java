package ZakupyWnuczka;

public class Kino {

    private int cenaBiletu = 20;

    public void sprzedajBilet(Wnuczek wnuczek) {

        if ((wnuczek.getKwota() + wnuczek.getDwniowka()) >= cenaBiletu) {
            System.out.println("Sprzedano bilet za kwotę: " + cenaBiletu);
        } else {
            System.out.println("Brak kasy an bilet");
        }
    }
}
