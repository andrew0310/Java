package NoweSrodkiPieniezne;

import java.util.function.Consumer;

public class NarratorZakupow {



    Consumer<SrodkiPieniezne> wypiszSrodki =
            srodkiPieniezne -> srodkiPieniezne.getSrodki().forEach((key, value)
                    -> System.out.println(key + " " + value));


    public void wypiszSrodki(SrodkiPieniezne srodki) {
        wypiszSrodki.accept(srodki);
    }
}
