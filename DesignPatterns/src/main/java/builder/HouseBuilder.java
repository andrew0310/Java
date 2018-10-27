package builder;

public class HouseBuilder {

    private final float DefaultPrice = 0.0f;

    public void setDefaultHouseWithoutGarage() {

        /*this.area = 1.0f;
        this.hasGarrage = false;
        this.garageArea = 0.0f;*/

        this.setArea(1.0f);
        this.setHasGarrage(false);
        this.setGarageArea(0.0f);
    }

    private float area;
    private float price;
    private int floor;
    private int roomsCount;
    private String adress;
    private int buildYear;
    private int age;
    private boolean hasBalcony;
    private boolean hasGarrage;
    private boolean hasPool;
    private float garageArea;
    private float height;


    public House build() {
        return new House(area, price, floor, roomsCount, adress, buildYear, age, hasBalcony, hasGarrage, hasPool, garageArea, height);
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasGarrage(boolean hasGarrage) {
        this.hasGarrage = hasGarrage;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setGarageArea(float garageArea) {
        this.garageArea = garageArea;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
