import Basic.Welcome;
import Basic.World;

public class Main {
    public static void main(String[] args) {

        int[] coords = Welcome.welcomeMessage();
        World world = new World(coords[0], coords[1]);
        world.populateTheWorld();
        world.drawTheWorld();
    }
}
