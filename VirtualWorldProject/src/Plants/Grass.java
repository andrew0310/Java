package Plants;

import Basic.Organism;

public class Grass extends Organism {
    public Grass(int strength, int age, int initiative, int locationX, int localtionY) {
        super(strength, age, initiative, locationX, localtionY);
    }

    @Override
    public char drawOrganism() {
        return 'R';
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
