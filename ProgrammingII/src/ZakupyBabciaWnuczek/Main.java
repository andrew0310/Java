package ZakupyBabciaWnuczek;

import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Wnuczek wnuczek = new Wnuczek();

        new Portfel(10);
        new Skarpeta(20);
        new Karta(200).getMetodyPlatnosci();

        final Collection<ZrodloPieniedzy> zrodlo = new HashSet<>();
        zrodlo.add(new Portfel(35));
        zrodlo.add(new Skarpeta(20));
        zrodlo.add(new Karta(200));


        int total = 0;

        for (ZrodloPieniedzy zrodloPieniedzy : zrodlo) {
            zrodloPieniedzy.pobierzKwote();
            total += zrodloPieniedzy.pobierzKwote();
        }
        System.out.println("Twój majątek wynosi: " + total);
    }
}
