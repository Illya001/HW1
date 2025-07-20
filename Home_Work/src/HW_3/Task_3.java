package HW_3;

import java.util.Scanner;

public class Task_3 {
    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a - b);
        }
        else if (a < b){
            System.out.println(b - a);
        }
        else {
            System.out.println("Ти не зрозумів завдання");
        }

    }

}