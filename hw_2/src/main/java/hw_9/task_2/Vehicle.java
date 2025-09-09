package hw_9.task_2;


public class Vehicle {
    private static Vehicle instance;

    private String name;
    private int speed;
    private double price;

    private Vehicle() {}

    public static Vehicle getInstance() {
        if (instance == null) {
            instance = new Vehicle();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', speed=" + speed + ", price=" + price + "}";
    }
}
