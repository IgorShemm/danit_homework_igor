package hw_6_1.task_2;

public class Car extends Vehicle {
    int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + name + " is moving at speed " +
                speed + " km/h with " + passengerCapacity + " passengers");
    }
}