package Plants;
import Basic.Organism;

public abstract class Plant extends Organism {
    public Plant(int strength, int age, int initiative, int localizationX, int localizationY) {
        super(strength, age, initiative, localizationX, localizationY);
    }
}
