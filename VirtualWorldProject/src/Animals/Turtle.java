package Animals;

public class Turtle extends Animal {
    public Turtle(int strength, int age, int initiative, int localizationX, int localizationY) {
        super(strength, age, initiative, localizationX, localizationY);
    }

    @Override
    public char drawOrganism() {
        return 'T';
    }

    @Override
    public void collision() {

    }

}
