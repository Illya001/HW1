package HW_6_3;

public class Aplication {
    public static void main(String[] args) {
        Media[] mediaArray = new Media[3];

        mediaArray[0] = new Media("Generic Media", 10);
        mediaArray[1] = new Music("Imagine", 4, "John Lennon");
        mediaArray[2] = new Video("Nature Documentary", 45, "1920x1080");

        for (Media media : mediaArray) {
            media.play();
        }
    }
}
