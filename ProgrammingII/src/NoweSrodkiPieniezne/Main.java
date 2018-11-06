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

        Babcia babcia = new Babcia("Hela");
        ProsteZrodloPieniedzy skarpetaBabci = new Skarpeta(770);
        ZrodloPieniedzy kartaBabci = new KartaPlatnicza(100);
        ZrodloPieniedzy kartaBabci2 = new KartaPlatnicza(200);

        System.out.println();

        System.out.println("Środki babci - stan aktualny: ");
        narratorZakupow.wypiszSrodki(skarpetaBabci.stanDostepnychSrodkow());
        System.out.println("Zabieramy babci jej środki.");
        narratorZakupow.wypiszSrodki(babcia.zabierzDostepneSrodki());
        System.out.println("Środki babci - stan aktualny: ");
        narratorZakupow.wypiszSrodki(skarpetaBabci.stanDostepnychSrodkow());

    }
}
