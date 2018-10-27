package conference;

import java.util.ArrayList;
import java.util.List;

public class ConferenceCenter {
    private boolean centerCondition;
    private List<ConferenceRoom> conferenceRooms = new ArrayList<>();

    public ConferenceCenter(List<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public ConferenceCenter() {
    }

    public boolean addConferenceRoom(ConferenceRoom conferenceRoom) {

        for (ConferenceRoom conferenceRoomFromList : conferenceRooms) {
            if (conferenceRoomFromList.getRoomNo() == conferenceRoom.getRoomNo()) {
                return false;
            }
        }
        conferenceRooms.add(conferenceRoom);
        return true;
    }

    public void listAllRooms() {
        System.out.println(conferenceRooms);
    }

    public ConferenceRoom findCheapRoom(int spaceNeeded) {

        List<ConferenceRoom> listTheBest = new ArrayList<>();

        for (ConferenceRoom conferenceRoomFromList : conferenceRooms) {
            if (conferenceRoomFromList.getRoomCapacity() >= spaceNeeded) {
                listTheBest.add(conferenceRoomFromList);
            }
        }
        if (listTheBest.isEmpty()) return null;
        ConferenceRoom cheapest = listTheBest.get(0);
        for (ConferenceRoom conferenceRoom : listTheBest) {
            if (conferenceRoom.getRoomPrice() < cheapest.getRoomPrice()) {
                cheapest = conferenceRoom;
            }
        }
        return cheapest;
    }

    public ConferenceRoom findCheapestUnconditionally() {

        ConferenceRoom cheapest = conferenceRooms.get(0);

        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.getRoomPrice() < cheapest.getRoomPrice()) {
                cheapest = conferenceRoom;
            }
        }
        return cheapest;
    }

    public boolean reservation(int roomNo) {

        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.getRoomNo() == roomNo && conferenceRoom.isRoomIsFree() == true) {
                conferenceRoom.setRoomIsFree(false);
                return true;
            }
        }
        return false;
    }

    public boolean cancelReservation (int roomNo){

        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if(conferenceRoom.getRoomNo() == roomNo && conferenceRoom.isRoomIsFree() == false) {
                conferenceRoom.setRoomIsFree(true);
                return true;
            }
        }
        return false;
    }

    public void showFreeRooms(){

        List<ConferenceRoom> freeRooms = new ArrayList<>();

        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if(conferenceRoom.isRoomIsFree() == true) {
                freeRooms.add(conferenceRoom);
            }
        }
        System.out.println(freeRooms);
    }
}
