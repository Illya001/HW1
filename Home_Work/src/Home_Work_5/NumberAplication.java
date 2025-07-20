package Home_Work_5;
import java.util.Random;
import java.util.Scanner;
public class NumberAplication {
    private String name;
    private int gameNumber;


    public NumberAplication(String name) {
        this.name = name;
        Random random = new Random();
        this.gameNumber = random.nextInt(101);
    }

    public void startGame(Scanner scanner) {
        while (true) {
            System.out.print("Enter your guess (number from 0 to 100): ");
            int guess;

            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            if (guess < gameNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > gameNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}