package ZakupyBabciaWnuczek;

public class Babcia extends ZrodloPieniedzyA {



    public Babcia(int kwota) {
        super(kwota);
    }

    void robObiad() {
        System.out.println("Babcia robi obiad.");
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
