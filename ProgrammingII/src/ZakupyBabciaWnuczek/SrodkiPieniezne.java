package ZakupyBabciaWnuczek;

import java.util.Map;

public interface SrodkiPieniezne {

    Map<MetodyPlatnosci, Integer> getSrodki();

    Integer getKwota(MetodyPlatnosci metodyPlatnosci);

    Integer getKwota();
}
