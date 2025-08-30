package hw_6_1.task_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Car ===");
        Car car = new Car("Sedan", 80, 4);
        car.move();
        car.stop();

        System.out.println("\n=== Truck ===");
        Truck truck = new Truck("Volvo Truck", 60, 12.5);
        truck.move();
        truck.stop();
    }
}
