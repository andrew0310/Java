package ZakupyWnuczka;

public class Wnuczek {

    public int kwota;
    public int dwniowka;
    public Babcia babcia;

    public Wnuczek(Babcia babcia) {
        this.kwota = babcia.getSkarpeta();
        this.babcia = babcia;
    }

    public int getDwniowka() {
        return dwniowka;
    }

    public void setDwniowka(int dwniowka) {
        this.dwniowka = dwniowka;
    }

    public int getKwota() {
        return kwota;
    }

    public Babcia getBabcia() {
        return babcia;
    }
}

