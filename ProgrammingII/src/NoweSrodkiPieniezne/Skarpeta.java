package NoweSrodkiPieniezne;


public class Skarpeta extends ProsteZrodloPieniedzyC {

    public Skarpeta(Integer kwota) {
        super(FormaPieniedzy.GOTOWKA, kwota);
    }

    @Override
    public FormaPieniedzy getformaPieniedzy() {
        return null;
    }
}
