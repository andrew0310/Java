package ZakupyWnuczka;

public class Babcia {

    public Skarpeta skarpeta;

    public Babcia(Skarpeta skarpeta) {
        this.skarpeta = skarpeta;
    }

    public int getSkarpeta() {
        return skarpeta.getKwota();
    }

    public void setSkarpeta(Skarpeta skarpeta) {
        this.skarpeta = skarpeta;
    }
}

