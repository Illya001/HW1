package HW_4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Число " + input + " є паліндромом.");
        } else {
            System.out.println("Число " + input + " не є паліндромом.");
        }
    }

    public static boolean isPalindrome(String number) {
        String reversed = new StringBuilder(number).reverse().toString();
        return number.equals(reversed);
    }
}
