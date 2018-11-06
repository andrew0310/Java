package NoweSrodkiPieniezne;

import java.util.HashMap;
import java.util.Map;

public class SrodkiPieniezneC implements SrodkiPieniezne {


    private Map<FormaPieniedzy, Integer> srodki = new HashMap<>();

    public SrodkiPieniezneC() {
    }

    public SrodkiPieniezneC(Map<FormaPieniedzy, Integer> srodki) {
        this.srodki.putAll(srodki);
    }

    public SrodkiPieniezneC(Integer kwota, FormaPieniedzy formaPieniedzy) {
        this.srodki.put(formaPieniedzy, kwota);
    }


    @Override
    public Map<FormaPieniedzy, Integer> getSrodki() {
        return srodki;
    }

    @Override
    public Integer getKwota(FormaPieniedzy formaPieniedzy) {
        return this.srodki.getOrDefault(formaPieniedzy, 0);
    }

    @Override
    public Integer getKwota() {

        return srodki.values().stream().mapToInt(Integer::intValue).sum();
    }
}
