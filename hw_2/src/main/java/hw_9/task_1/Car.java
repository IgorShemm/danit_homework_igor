package hw_9.task_1;

public class Car {
    private String brand;
    private int speed;

    public Car() {
    }

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', speed=" + speed + " km/h}";
    }
}