package ZakupyBabciaWnuczek;

public class Dniowka extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;

    public Dniowka(int kwota) {
        super(kwota);
    }

    @Override
    public MetodyPlatnosci getMetodaPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.GOTOWKA;
    }
}
