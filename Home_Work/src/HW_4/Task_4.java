package HW_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть індекс імені (0-" + (names.length - 1) + "): ");
        int nameIndex = scanner.nextInt();

        System.out.print("Введіть індекс часу (0-" + (times.length - 1) + "): ");
        int timeIndex = scanner.nextInt();

        System.out.print("Введіть індекс місця (0-" + (places.length - 1) + "): ");
        int placeIndex = scanner.nextInt();

        if (nameIndex >= 0 && nameIndex < names.length &&
                timeIndex >= 0 && timeIndex < times.length &&
                placeIndex >= 0 && placeIndex < places.length) {

            String message = names[nameIndex] + " буде йти до " + places[placeIndex] +
                    " о " + times[timeIndex] + ":00";
            System.out.println(message);
        } else {
            System.out.println("Невірно введені індекси. Перевірте діапазони.");
        }
    }
}
