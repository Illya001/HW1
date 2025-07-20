package HW_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три цілі числа — сторони трикутника:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("З цих сторін МОЖНА побудувати трикутник.");
        } else {
            System.out.println("З цих сторін НЕ МОЖНА побудувати трикутник.");
        }
    }
}