import java.util.Scanner;

public class GameChooser {

    private int gameChoosing;

    public GameChooser() {
        this.gameChoosing = gameChoosing;
    }

    public int getGameChoosing() {

        System.out.println("Please choose your game: \nGuess The Number - 1\nHang Man - 2\nWho Wants to Be a Millionaire - 3");
        Scanner s = new Scanner(System.in);
        int number = 0;
        try {
            number = s.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry, wrong value, try one more time:");
        }
        return number;
    }
}


