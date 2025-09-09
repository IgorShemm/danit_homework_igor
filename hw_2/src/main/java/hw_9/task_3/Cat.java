package hw_9.task_3;


public class Cat implements Animal {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
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
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "'}";
    }
}