package ZakupyBabciaWnuczek;

public class Karta extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;

    public MetodyPlatnosci getMetodyPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.ELEKTRONICZNA;
    }

    public Karta(int kwota) {
        super(kwota);
    }
}
