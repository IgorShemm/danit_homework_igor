package hw_6_1.task_2;

public class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + getName() + " is moving at speed " +
                getSpeed() + " km/h with " + passengerCapacity + " passengers");
    }
}