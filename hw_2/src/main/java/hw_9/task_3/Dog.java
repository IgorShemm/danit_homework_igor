package hw_9.task_3;


public class Dog implements Animal {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
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
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "'}";
    }
}