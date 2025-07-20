package HW2;
public class Task_3 {
    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        String lowerText = text.toLowerCase();

        String[] parts = lowerText.split("a");

        int count = parts.length - 1;

        System.out.println("Символ 'a' (без урахування регістру) зустрічається " + count + " разів.");
    }
}


