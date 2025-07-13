package hw_4.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Enter the total storage capacity of the warehouse (in kg):");
        int warehouseCapacity = userInputScanner.nextInt();

        int remainingCapacity = warehouseCapacity;

        while (remainingCapacity > 0) {
            System.out.println("Enter the weight of metal to deposit (in kg):");
            int depositWeight = userInputScanner.nextInt();

            if (depositWeight < 5) {
                System.out.println("Deposit rejected: weight must be at least 5 kg.");
                continue;
            }

            if (depositWeight > remainingCapacity) {
                System.out.println("Deposit rejected: not enough space in the warehouse.");
                continue;
            }

            // Accept deposit
            remainingCapacity -= depositWeight;
            System.out.println("Deposit accepted. Remaining capacity: " + remainingCapacity + " kg.");
        }

        System.out.println("Warehouse is full. No further deposits possible.");
    }
}