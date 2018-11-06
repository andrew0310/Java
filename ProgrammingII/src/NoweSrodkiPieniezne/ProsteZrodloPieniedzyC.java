package NoweSrodkiPieniezne;

public abstract class ProsteZrodloPieniedzyC implements ProsteZrodloPieniedzy {

    private FormaPieniedzy formaPieniedzy;

    protected Integer kwota;

    public ProsteZrodloPieniedzyC(FormaPieniedzy formaPieniedzy, Integer kwota) {
        this.formaPieniedzy = formaPieniedzy;
        this.kwota = kwota;
    }

    public FormaPieniedzy getformaPieniedzy() {
        return formaPieniedzy;
    }

    @Override
    public void ustawKwote(Integer kwota) {
        this.kwota = kwota;
    }

    @Override
    public void dodajKwote(Integer kwota) {

    }

    @Override
    public Integer odejmijKwote(Integer kwota) {
        return null;
    }

    @Override
    public SrodkiPieniezne zabierzDostepneSrodki() {
        SrodkiPieniezne srodkiPieniezne = this.stanDostepnychSrodkow();
        this.kwota = 0;
        return srodkiPieniezne;
    }

    @Override
    public SrodkiPieniezne stanDostepnychSrodkow() {
        return new SrodkiPieniezneC(this.kwota, this.formaPieniedzy);
    }
}

