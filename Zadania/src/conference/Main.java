package conference;

public class Main {
    public static void main(String[] args) {

        ConferenceRoom conferenceRoom1 = new ConferenceRoom(1, true, 150, 230.99);
        ConferenceRoom conferenceRoom2 = new ConferenceRoom(2, true, 60, 155.7);
        ConferenceRoom conferenceRoom3 = new ConferenceRoom(3, true, 230, 489.5);
        ConferenceRoom conferenceRoom4 = new ConferenceRoom(4, true, 20, 60.99);
        ConferenceRoom conferenceRoom5 = new ConferenceRoom(5, true, 5, 30.78);

        //System.out.println(Arrays.asList(conferenceRoom1, conferenceRoom2, conferenceRoom3, conferenceRoom4, conferenceRoom5));

        ConferenceCenter conferenceCenter = new ConferenceCenter();
        conferenceCenter.addConferenceRoom(conferenceRoom1);
        conferenceCenter.addConferenceRoom(conferenceRoom2);
        conferenceCenter.addConferenceRoom(conferenceRoom3);
        conferenceCenter.addConferenceRoom(conferenceRoom4);
        conferenceCenter.addConferenceRoom(conferenceRoom5);

        System.out.println(conferenceCenter.addConferenceRoom(conferenceRoom4));  //false

        conferenceCenter.listAllRooms();

        System.out.println(conferenceCenter.findCheapRoom(55));
        System.out.println(conferenceCenter.findCheapestUnconditionally());
        System.out.println(conferenceCenter.reservation(4));        //true
        System.out.println(conferenceCenter.reservation(4));     //false
        System.out.println(conferenceCenter.cancelReservation(4));  //true

        conferenceCenter.showFreeRooms();


    }
}
