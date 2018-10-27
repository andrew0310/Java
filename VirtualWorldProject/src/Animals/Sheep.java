package Animals;

public class Sheep extends Animal {

    public Sheep(int strength, int age, int initiative, int localizationX, int localizationY) {
        super(strength, age, initiative, localizationX, localizationY);
    }

    @Override
    public char drawOrganism() {
        return 'S';
    }

    @Override
    public void collision() {

    }

}
