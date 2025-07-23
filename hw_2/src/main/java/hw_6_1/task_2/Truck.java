package hw_6_1.task_2;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + getName() + " with load capacity " +
                loadCapacity + " tons is moving at speed " + getSpeed() + " km/h");
    }
}