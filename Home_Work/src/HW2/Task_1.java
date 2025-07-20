package HW2;

public class Task_1 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = "This line that i want to cut, cause";
        String string3 = "This line that don't want to cut, cause it is perfect";

        System.out.println("string1: " + string1);
        System.out.println("Довжина string1: " + string1.length());

        System.out.println("string2: " + string2);
        System.out.println("Довжина string2: " + string2.length());

        System.out.println("string3: " + string3);
        System.out.println("Довжина string3: " + string3.length());
    }
}