package observer;

public class VIPSubscriberObservable implements Observable {

    private String firstName;
    private String lastName;

    public VIPSubscriberObservable(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void readNewspaper(String name) {
        System.out.println(this.firstName + " " + this.lastName + " czyta gazetę o nazwie " + name + ". Gazeta jest w twardej oprawie.");
    }

    public void playDVD(){
        System.out.println(this.firstName + " odtwarza film 'GRA O TRON'.");
    }
}
