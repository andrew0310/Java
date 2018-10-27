package Plants;

import Basic.Organism;

public class Dandelion extends Organism {
    public Dandelion(int strength, int age, int initiative, int locationX, int localtionY) {
        super(strength, age, initiative, locationX, localtionY);
    }

    @Override
    public char drawOrganism() {
        return 'D';
    }

    @Override
    public void action() {

    }

    @Override
    public void collision() {

    }

    @Override
    public void move() {

    }
}
