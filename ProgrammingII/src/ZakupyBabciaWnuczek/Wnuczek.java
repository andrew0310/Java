package ZakupyBabciaWnuczek;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Wnuczek {

    public int kwota;
    public Babcia babcia;
    public ZrodloPieniedzy zrodloPieniedzy;
    public MetodyPlatnosci metodyPlatnosci;

    final Collection<ZrodloPieniedzy> zrodla = new HashSet<>();
    public Map<MetodyPlatnosci, Integer> mapaHajsu = new HashMap<>();

    public Wnuczek() {
    }

    public void dodajDoListy(ZrodloPieniedzy zrodloPieniedzy) {
        zrodla.add(zrodloPieniedzy);
    }

    public void wyswietl() {
        int tot = 0;
        int tot2 = 0;

        for (ZrodloPieniedzy zrodloPieniedzy : zrodla) {
            if (zrodloPieniedzy.getMetodaPlatnosci().equals(MetodyPlatnosci.ELEKTRONICZNA)) {
                tot += zrodloPieniedzy.pobierzKwote();
            } else {
                tot2 += zrodloPieniedzy.pobierzKwote();
            }
        }
        System.out.println(tot + " elektroniczne");
        System.out.println(tot2 + " gotówka");
        mapaHajsu.put(MetodyPlatnosci.ELEKTRONICZNA, tot);
        mapaHajsu.put(MetodyPlatnosci.GOTOWKA, tot2);
    }

    public ZrodloPieniedzy getZrodloPieniedzy() {
        return zrodloPieniedzy;
    }

    public Babcia getBabcia() {
        return babcia;
    }
}

