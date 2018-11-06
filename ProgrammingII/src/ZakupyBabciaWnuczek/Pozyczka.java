package ZakupyBabciaWnuczek;

public class Pozyczka extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;


    public Pozyczka(int kwota) {
        super(kwota);
    }

    @Override
    public SrodkiPieniezne zabierzDostepneSrodki() {
        return null;
    }

    @Override
    public SrodkiPieniezne stanDostepnychSrodkow() {
        return null;
    }

    @Override
    public MetodyPlatnosci getMetodaPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.GOTOWKA;
    }
}
