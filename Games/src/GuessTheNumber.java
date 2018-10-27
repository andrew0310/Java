import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber implements Playable {

    private int bound;
    private int lifesLeft;

    Difficulty easy = Difficulty.EASY;
    Difficulty medium = Difficulty.MEDIUM;
    Difficulty hard = Difficulty.HARD;

    Random random = new Random();
    int numberToGuess;
    Scanner scanner = new Scanner(System.in);
    ChoosingDifficulty choosingDifficulty = new ChoosingDifficulty();
    GameChooser gameChooser = new GameChooser();

    public void checkUserNumber() {

        scanner = new Scanner(System.in);

        int givenByUser;
        do {
            givenByUser = scanner.nextInt();

            if (lifesLeft == 0) {
                System.out.println("Sorry, you loose. The number was: " + numberToGuess);
                break;
            } else if (givenByUser == numberToGuess) {
                System.out.println("Great, You won!! " + numberToGuess);
                break;
            }
            if (givenByUser > numberToGuess) {
                System.out.println("Sorry, my number is smaller, try one more time: ");
                lifesLeft--;
            } else if (givenByUser < numberToGuess) {
                System.out.println("Sorry, my number is bigger, try one more time: ");
                lifesLeft--;
            }
        } while (lifesLeft != 0 || givenByUser == numberToGuess);
    }

    @Override
    public void start() {

        int d = choosingDifficulty.getDifficulty();

        try {
            int diff = d;
            if (diff == easy.getValuesOfLevels()) {
                System.out.println("You choosed level EASY <<BOUND: 100, Lifes: 7>>");
                bound = 100;
                lifesLeft = 7;
            } else if (diff == medium.getValuesOfLevels()) {
                System.out.println("You choosed level MEDIUM <<BOUND: 300, Lifes: 10>>");
                bound = 300;
                lifesLeft = 10;
            } else if (diff == hard.getValuesOfLevels()) {
                System.out.println("You choosed level HARD <<BOUND: 300, Lifes: 5>>");
                bound = 300;
                lifesLeft = 5;
            }
        } catch (Exception e) {
            System.out.println("Sorry, wrong value, try one more time:");
            start();
        }

        numberToGuess = random.nextInt(bound);

        try {
            checkUserNumber();
        } catch (Exception ex) {
            System.out.println("Sorry, wrong value, try one more time:");
        }
        checkUserNumber();
    }
}

