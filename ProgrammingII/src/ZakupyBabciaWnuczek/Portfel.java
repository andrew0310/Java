package ZakupyBabciaWnuczek;


public class Portfel implements ProsteZrodloPieniedzy {

    MetodyPlatnosci metodyPlatnosci;
    int suma = 0;

    @Override
    public SrodkiPieniezne zabierzDostepneSrodki() {
        this.suma = 0;
        return null;
    }

    @Override
    public SrodkiPieniezne stanDostepnychSrodkow() {
        return null;
    }

    @Override
    public int pobierzKwote() {
        return this.suma;
    }

    @Override
    public MetodyPlatnosci getMetodaPlatnosci() {
        return metodyPlatnosci = MetodyPlatnosci.GOTOWKA;
    }

    @Override
    public void ustawKwote(Integer kwota) {
        this.suma = kwota;
    }

    @Override
    public void dodajKwote(Integer kwota) {
        this.suma = Integer.sum(this.suma, kwota);
    }

    @Override
    public Integer odejmijKwote(Integer kwota) {

        if (kwota > this.suma) {
            System.out.println("Nie można pobrać takiej ilości.");
        } else {
            this.suma -= kwota;
        }
        return this.suma;
    }

    @Override
    public MetodyPlatnosci metodyPlatnosci() {
        return metodyPlatnosci;
    }
}
