package ZakupyBabciaWnuczek;

public interface ZrodloPieniedzy {

    SrodkiPieniezne zabierzDostepneSrodki();

    SrodkiPieniezne stanDostepnychSrodkow();

    int pobierzKwote();

    MetodyPlatnosci getMetodaPlatnosci();
}
