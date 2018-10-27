package observer;

public class Main {
    public static void main(String[] args) {

        Observable tomek = new SubscriberObservable("Tomek");
        Observable macierewicz = new SubscriberObservable("Macierewicz");
        Observable jaroslawKaczynski = new SubscriberObservable("Jarosław Kaczyński");
        Observable adrianDuda = new SubscriberObservable("Adrian Duda");
        Observable giertych = new SubscriberObservable("Giertych");
        Observable bear = new SubscriberObservable("Miś Uszatek");
        Observable suski = new SubscriberObservable("Marek Suski");
        Observable akira = new VIPSubscriberObservable("Akira", "Toriama");
        Observable sapkowski = new VIPSubscriberObservable("Andrzej", "Sapkowski");
        Observable kwasniewski = new VIPSubscriberObservable("Aleksander", "Kwaśniewski");

        CKMObserver ckmRedaction = new CKMObserver();
        ckmRedaction.subscribe(tomek);
        ckmRedaction.subscribe(macierewicz);
        ckmRedaction.subscribe(akira);
        ckmRedaction.subscribe(jaroslawKaczynski);
        ckmRedaction.subscribe(adrianDuda);
        ckmRedaction.subscribe(sapkowski);
        ckmRedaction.subscribe(giertych);
        ckmRedaction.subscribe(bear);
        ckmRedaction.subscribe(kwasniewski);
        ckmRedaction.subscribe(suski);

        ckmRedaction.sendToAll();

        Observer pixelRedaction = new PixelObserver();
        pixelRedaction.subscribe(tomek);
        pixelRedaction.subscribe(sapkowski);

        pixelRedaction.sendToAll();
    }
}
