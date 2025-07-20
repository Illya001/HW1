package HW_4;

import java.util.Scanner;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + target + " знайдено в масиві.");
        } else {
            System.out.println("Число " + target + " не знайдено в масиві.");
        }
    }
}
