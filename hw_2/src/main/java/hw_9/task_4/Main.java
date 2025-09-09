package hw_9.task_4;


public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Tesla Model S")
                .setPrice(79999.99)
                .setMaxSpeed(250)
                .setCountOfWheels(4)
                .build();

        System.out.println(car);
    }
}