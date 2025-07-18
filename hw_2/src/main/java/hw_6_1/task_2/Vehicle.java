package hw_6_1.task_2;

public class Vehicle {
    String name;
    int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Vehicle is moving at speed " + speed + " km/h");
    }

    public void stop() {
        System.out.println("Vehicle " + name + " has stopped");
    }
}
