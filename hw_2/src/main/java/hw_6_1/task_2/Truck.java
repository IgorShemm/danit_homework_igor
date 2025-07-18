package hw_6_1.task_2;

public class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + name + " with load capacity " +
                loadCapacity + " tons is moving at speed " + speed + " km/h");
    }
}