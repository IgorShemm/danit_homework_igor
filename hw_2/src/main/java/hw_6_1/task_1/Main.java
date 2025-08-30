package hw_6_1.task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bird ===");
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();

        System.out.println("\n=== Fish ===");
        Fish fish = new Fish();
        fish.eat();
        fish.sleep();
        fish.swim();

        System.out.println("\n=== Dog ===");
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}