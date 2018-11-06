package ZakupyBabciaWnuczek;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ZrodloPieniedzyA implements ZrodloPieniedzy {

    private MetodyPlatnosci metodyPlatnosci;
    private int kwota;
    private Collection<ZrodloPieniedzy> zrodloPieniedzyCollection = new ArrayList<>();

    public ZrodloPieniedzyA(int kwota, MetodyPlatnosci metodyPlatnosci) {
        this.kwota = kwota;
        this.metodyPlatnosci = metodyPlatnosci;
    }

    public ZrodloPieniedzyA(int kwota) {
        this.kwota = kwota;
    }

    public int getKwota() {
        return kwota;
    }

    public MetodyPlatnosci getMetodyPlatnosci() {
        return metodyPlatnosci;
    }

    public void dodajDoListy(ZrodloPieniedzy zrodloPieniedzy) {
        this.zrodloPieniedzyCollection.add(zrodloPieniedzy);
    }

    @Override
    public int pobierzKwote() {
        return kwota;
    }
}

