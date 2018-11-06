package ZakupyBabciaWnuczek;

public class Dniowka extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;

    public Dniowka(int kwota) {
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
