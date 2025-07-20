package HW2;

public class Task_2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";

        String[] words = string.replace(",", "").split(" ");

        int maxLength = 0;
        int firstWordLength = words[0].length();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            System.out.println("Слово" + (i + 1) + " = " + word + ", Довжина цього слова = " + length);

            if (i > 0 && length > maxLength) {
                maxLength = length;
            }
        }

        boolean isFirstLongest = firstWordLength > maxLength;
        System.out.println(isFirstLongest);
    }
}
