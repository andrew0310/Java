import java.util.Scanner;

public class ChoosingDifficulty {
    private String choosingDifficulty;

    public ChoosingDifficulty() {
        this.choosingDifficulty = choosingDifficulty;
    }

    public int getDifficulty() {
        System.out.println("Choose difficulty:\nEASY - 1\nMEDIUM - 2\nHARD - 3");
        Scanner s = new Scanner(System.in);
        int number = 0;
        try {
            number = Integer.parseInt(s.nextLine());
        } catch (Exception e) {
            System.out.println("Sorry, wrong value, try one more time:");
        }
        return number;
    }
}
