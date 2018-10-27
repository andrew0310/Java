package Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {

    public static int[] welcomeMessage() {

        int[] coords = new int[2];

        Scanner s = new Scanner(System.in);
        int coordinateX = 0;
        int coordinateY = 0;

        System.out.println("Welcome, please specify size of your world:");
        try {
            coordinateX = s.nextInt();
            coordinateY = coordinateX;
        } catch (
                InputMismatchException e) {
            System.out.println("Wrong value, please try again.");
        }
        coords[0] = coordinateX;
        coords[1] = coordinateY;

        return coords;
    }
}
