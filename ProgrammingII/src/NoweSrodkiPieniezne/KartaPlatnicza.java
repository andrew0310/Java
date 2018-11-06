package NoweSrodkiPieniezne;

public class KartaPlatnicza extends ProsteZrodloPieniedzyC {


    public KartaPlatnicza(Integer kwota) {
        super(FormaPieniedzy.ELEKTRONICZNA, kwota);
    }

    @Override
    public SrodkiPieniezne zabierzDostepneSrodki() {
        final SrodkiPieniezne srodkiPieniezne = super.zabierzDostepneSrodki();
        return new SrodkiPieniezneC(srodkiPieniezne.getSrodki());
    }
}
