package Home_Work_5;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        NumberAplication game = new NumberAplication(name);
        game.startGame(scanner);

        scanner.close();
    }
}