package Plants;

import Basic.Organism;

public class Berry extends Organism {
    public Berry(int strength, int age, int initiative, int locationX, int localtionY) {
        super(strength, age, initiative, locationX, localtionY);
    }

    @Override
    public char drawOrganism() {
        return 'B';
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
