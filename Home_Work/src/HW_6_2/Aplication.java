package HW_6_2;

public class Aplication {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 5);
        Truck truck = new Truck("Volvo Truck", 80, 18.5);

        System.out.println("Автомобіль:");
        car.move();
        car.stop();

        System.out.println("\nВантажівка:");
        truck.move();
        truck.stop();
    }
}