package Plants;

import Basic.Organism;

public class Guarana extends Organism {
    public Guarana(int strength, int age, int initiative, int locationX, int localtionY) {
        super(strength, age, initiative, locationX, localtionY);
    }

    @Override
    public char drawOrganism() {
        return 'G';
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
