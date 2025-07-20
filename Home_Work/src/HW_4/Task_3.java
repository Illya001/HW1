package HW_4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть максимальну вагу, яку може зберігати склад (кг): ");
        int maxCapacity = scanner.nextInt();
        int currentCapacity = maxCapacity;

        while (currentCapacity > 0) {
            System.out.print("Введіть вагу металу для здачі (кг): ");
            int weight = scanner.nextInt();

            if (weight < 5) {
                System.out.println("Неможливо прийняти таку малу вагу. Мінімум — 5 кг.");
            } else if (weight > currentCapacity) {
                System.out.println("Недостатньо місця на складі. Доступно тільки " + currentCapacity + " кг.");
            } else {
                currentCapacity -= weight;
                System.out.println("Прийнято " + weight + " кг металу. Залишилось місця: " + currentCapacity + " кг.");
            }

            if (currentCapacity == 0) {
                System.out.println("Склад заповнено. Прийом металу завершено.");
                break;
            }
        }
    }
}
