package Basic;

public abstract class Organism {

    protected World world;
    protected int strength;
    private int age;
    private int initiative;
    private int locationX;
    private int locationY;

    public Organism(int strength, int age, int initiative, int locationX, int locationY) {
        this.strength = strength;
        this.age = age;
        this.initiative = initiative;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }



    public abstract char drawOrganism();

    public abstract void action();

    public abstract void collision();

    public abstract void move();
}
