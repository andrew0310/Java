package Animals;

public class Antelope extends Animal {
    public Antelope(int strength, int age, int initiative, int localizationX, int localizationY) {
        super(strength, age, initiative, localizationX, localizationY);
    }

    @Override
    public char drawOrganism() {
        return 'A';
    }

    @Override
    public void collision() {

    }
}
