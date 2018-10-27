package Animals;

public class Fox extends Animal {
    public Fox(int strength, int age, int initiative, int localizationX, int localizationY) {
        super(strength, age, initiative, localizationX, localizationY);
    }

    @Override
    public char drawOrganism() {
        return 'F';
    }

    @Override
    public void collision() {
    }

    @Override
    public void action() {
    }
}
