package ZakupyBabciaWnuczek;

public class Skarpeta extends ZrodloPieniedzyA {

    MetodyPlatnosci metodyPlatnosci;


    public Skarpeta(int kwota) {
        super(kwota);
    }

    void zgnij() {
        System.out.println("Śmierdzi nieziemsko!");
    }

    @Override
    public MetodyPlatnosci getMetodaPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.GOTOWKA;
    }
}
