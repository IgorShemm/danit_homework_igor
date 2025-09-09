package hw_9.task_3;



public class Bird implements Animal {
    private String name;

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Chirp!");
    }

    @Override
    public String toString() {
        return "Bird{name='" + name + "'}";
    }
}