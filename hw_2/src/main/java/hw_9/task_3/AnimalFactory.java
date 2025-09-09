package hw_9.task_3;


public class AnimalFactory {
    public Animal createAnimal(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                return null;
        }
    }
}
