package java_hw_3.task_3;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int difference = (a > b) ? a - b : b - a;

        System.out.println("Difference (greater - smaller) = " + difference);
    }
}