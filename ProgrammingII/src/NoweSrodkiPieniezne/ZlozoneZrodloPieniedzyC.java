package NoweSrodkiPieniezne;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

public class ZlozoneZrodloPieniedzyC implements ZlozoneZrodloPieniedzy {

    private Collection<ZrodloPieniedzy> zrodloPieniedzy = new ArrayList<>();


    @Override
    public void dodajZrodloPieniedzy(ZrodloPieniedzy... zrodloPieniedzy) {
        this.zrodloPieniedzy.addAll(Arrays.asList(zrodloPieniedzy));
    }

    @Override
    public SrodkiPieniezne zabierzDostepneSrodki() {
        return null;
    }

    @Override
    public SrodkiPieniezne stanDostepnychSrodkow() {
        return this.scal(ZrodloPieniedzy::stanDostepnychSrodkow);
    }

    private SrodkiPieniezne scal(Function<ZrodloPieniedzy, SrodkiPieniezne> mapper){
        return this.zrodloPieniedzy.stream().map(mapper).reduce(new SrodkiPieniezneC(), new ScalSrodki());
    }

}
