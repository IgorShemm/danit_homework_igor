package hw_9.task_2;


public class Main {
    public static void main(String[] args) {
        Vehicle v1 = Vehicle.getInstance();
        v1.setName("BMW");
        v1.setSpeed(240);
        v1.setPrice(50000);

        Vehicle v2 = Vehicle.getInstance();
        v2.setName("Audi");
        v2.setSpeed(220);
        v2.setPrice(45000);

        Vehicle v3 = Vehicle.getInstance();
        v3.setName("Toyota");
        v3.setSpeed(180);
        v3.setPrice(30000);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
    }
}