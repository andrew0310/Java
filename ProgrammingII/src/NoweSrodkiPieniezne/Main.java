package NoweSrodkiPieniezne;


public class Main {
    public static void main(String[] args) {

        NarratorZakupow narratorZakupow = new NarratorZakupow();

        System.out.println("Skarpeta: ");
        ZrodloPieniedzy skarpeta = new Skarpeta(700);
        narratorZakupow.wypiszSrodki(skarpeta.stanDostepnychSrodkow());

        Portfel portfel = new Portfel(100);


        ZlozoneZrodloPieniedzyC zlozoneZrodloPieniedzyC = new ZlozoneZrodloPieniedzyC();
        zlozoneZrodloPieniedzyC.dodajZrodloPieniedzy(portfel);
        zlozoneZrodloPieniedzyC.dodajZrodloPieniedzy(skarpeta);

        narratorZakupow.wypiszSrodki(zlozoneZrodloPieniedzyC.stanDostepnychSrodkow());

    }
}
