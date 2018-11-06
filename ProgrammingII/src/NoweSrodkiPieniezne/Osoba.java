package NoweSrodkiPieniezne;

public abstract class Osoba implements ZlozoneZrodloPieniedzy {

    protected String imie;
    protected Plec plec;
    protected ZlozoneZrodloPieniedzyC zlozoneZrodloPieniedzyC = new ZlozoneZrodloPieniedzyC();

    public Osoba(String imie, Plec plec) {
        this.imie = imie;
        this.plec = plec;
    }

    @Override
    public void dodajZrodloPieniedzy(ZrodloPieniedzy... zrodloPieniedzy) {
        this.zlozoneZrodloPieniedzyC.dodajZrodloPieniedzy(zrodloPieniedzy);
    }

    @Override
    public SrodkiPieniezne zabierzDostepneSrodki() {
        return this.zlozoneZrodloPieniedzyC.zabierzDostepneSrodki();
    }

    @Override
    public SrodkiPieniezne stanDostepnychSrodkow() {
        return this.zlozoneZrodloPieniedzyC.stanDostepnychSrodkow();
    }
}
