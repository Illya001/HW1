package HW_6;

public class Aplication {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Dog dog = new Dog();

        System.out.println("Пташка:");
        bird.eat();
        bird.sleep();
        bird.fly();

        System.out.println("\nРибка:");
        fish.eat();
        fish.sleep();
        fish.swim();

        System.out.println("\nСобака:");
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
