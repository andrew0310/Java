package ZakupyBabciaWnuczek;

public interface ProsteZrodloPieniedzy extends ZrodloPieniedzy {

    void ustawKwote(Integer kwota);

    void dodajKwote(Integer kwota);

    Integer odejmijKwote(Integer kwota);

    MetodyPlatnosci metodyPlatnosci();
}
