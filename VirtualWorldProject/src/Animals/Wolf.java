package Animals;

public class Wolf extends Animal {

    public Wolf(int strength, int age, int initiative, int localizationX, int localizationY) {
        super(strength, age, initiative, localizationX, localizationY);
    }

    @Override
    public char drawOrganism() {
        return 'W';
    }

    @Override
    public void collision() {

    }
}
