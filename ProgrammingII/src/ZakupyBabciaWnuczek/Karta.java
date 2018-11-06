package ZakupyBabciaWnuczek;

public class Karta extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;

    public MetodyPlatnosci getMetodyPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.ELEKTRONICZNA;
    }

    public Karta(int kwota) {
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
        return null;
    }
}
