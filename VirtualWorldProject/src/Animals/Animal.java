package Animals;

import Basic.Organism;

import java.util.Random;

public abstract class Animal extends Organism {

    public Animal(int strength, int age, int initiative, int localizationX, int localizationY) {
        super(strength, age, initiative, localizationX, localizationY);
    }


    @Override
    public void move() {
        Random r = new Random();
        this.setLocationX(this.getLocationX() + (r.nextInt(3) - 1));
        this.setLocationY(this.getLocationY() + (r.nextInt(3) - 1));

        int x = getLocationX();
        int y = getLocationY();
        int newLocation[] = new int[2];
        newLocation[0] = x;
        newLocation[1] = y;

        if (world.isFree(newLocation) == false) {
            collision();
        }
    }

    @Override
    public void action() {
        move();
    }

    @Override
    public void collision() {

    }
}

