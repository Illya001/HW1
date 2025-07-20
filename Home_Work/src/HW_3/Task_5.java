package HW_3;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        System.out.print("Введіть символ операції (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);

        int result = (operation == '+') ? (a + b) :
                (operation == '-') ? (a - b) :
                        (operation == '*') ? (a * b) :
                                (operation == '/') ? (b != 0 ? a / b : 0) :
                                        (operation == '%') ? (b != 0 ? a % b : 0) :
                                                0;

        System.out.println("Результат: " + result);
    }
}
