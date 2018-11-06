package NoweSrodkiPieniezne;

import java.util.Map;

public interface SrodkiPieniezne {

    Map<FormaPieniedzy, Integer> getSrodki();

    Integer getKwota(FormaPieniedzy formaPieniedzy);

    Integer getKwota();
}
