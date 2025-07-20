package HW_6_2;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Транспорт " + name + " за вантажопідйомністю " + loadCapacity + " т рухається зі швидкістю " + speed + " км/год");
    }
}