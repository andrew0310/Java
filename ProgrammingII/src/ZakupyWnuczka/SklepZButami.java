package ZakupyWnuczka;

public class SklepZButami {

    private int cenaTrampek = 120;

    public void sprzedajButy(Wnuczek wnuczek) {

        if ((wnuczek.getKwota() + wnuczek.getDwniowka()) >= cenaTrampek) {
            System.out.println("Sprzedano trampki za kwotę: " + cenaTrampek);
        } else {
            System.out.println("Brak kasy na trampki");
        }
    }
}
