import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Вводьте слова (введіть STOP, щоб завершити):");

        while (true) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            sentence.append(word).append(" ");
        }

        System.out.println("\nПобудоване речення:");
        System.out.println(sentence.toString().trim());
    }
}

