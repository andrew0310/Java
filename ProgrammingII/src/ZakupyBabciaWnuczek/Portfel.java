package ZakupyBabciaWnuczek;

public class Portfel extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;


    public Portfel(int kwota) {
        super(kwota);
    }

    @Override
    public MetodyPlatnosci getMetodaPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.GOTOWKA;
    }
}
