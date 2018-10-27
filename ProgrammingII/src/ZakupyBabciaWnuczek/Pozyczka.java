package ZakupyBabciaWnuczek;

public class Pozyczka extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;


    public Pozyczka(int kwota) {
        super(kwota);
    }

    @Override
    public MetodyPlatnosci getMetodaPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.GOTOWKA;
    }
}
