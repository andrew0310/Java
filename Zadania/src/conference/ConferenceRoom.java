package conference;

public class ConferenceRoom {
    private int roomNo;
    private boolean roomIsFree;
    private int roomCapacity;
    private double roomPrice;


    public ConferenceRoom(int roomNo, boolean roomIsFree, int roomCapacity, double roomPrice) {
        this.roomNo = roomNo;
        this.roomIsFree = roomIsFree;
        this.roomCapacity = roomCapacity;
        this.roomPrice = roomPrice;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public boolean isRoomIsFree() {
        return roomIsFree;
    }

    public void setRoomIsFree(boolean roomIsFree) {
        this.roomIsFree = roomIsFree;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    @Override
    public String toString() {
        return "conference{" +
                "roomNo=" + roomNo +
                ", roomIsFree=" + roomIsFree +
                ", roomCapacity=" + roomCapacity +
                ", roomPrice=" + roomPrice +
                '}';
    }
}
