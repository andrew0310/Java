package builder;

public class House {

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

    public House() {
    }

    public House(float area, float price, int floor, int roomsCount, String address, int buildYear, int age, boolean hasBalcony, boolean hasGarrage, boolean hasPool, float garageArea, float height) {
        this.area = area;
        this.price = price;
        this.floor = floor;
        this.roomsCount = roomsCount;
        this.adress = address;
        this.buildYear = buildYear;
        this.age = age;
        this.hasBalcony = hasBalcony;
        this.hasGarrage = hasGarrage;
        this.hasPool = hasPool;
        this.garageArea = garageArea;
        this.height = height;
    }


    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public String getAdress() {
        return adress;
    }

    public void setAddress(String adress) {
        this.adress = adress;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasGarrage() {
        return hasGarrage;
    }

    public void setHasGarrage(boolean hasGarrage) {
        this.hasGarrage = hasGarrage;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public float getGarageArea() {
        return garageArea;
    }

    public void setGarageArea(float garageArea) {
        this.garageArea = garageArea;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
