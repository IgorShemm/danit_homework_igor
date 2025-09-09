package java_hw_12.task_2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Tesla", 250, 60000.0, 4);
        Vehicle unknown = null;

        Optional<Vehicle> optionalCar = Optional.of(car);
        Optional<Vehicle> optionalUnknown = Optional.ofNullable(unknown);

        System.out.println("=== Testing Optional with non-null Vehicle ===");
        testOptional(optionalCar);

        System.out.println("\n=== Testing Optional with null Vehicle ===");
        testOptional(optionalUnknown);
    }

    private static void testOptional(Optional<Vehicle> optionalVehicle) {
        System.out.println("isPresent(): " + optionalVehicle.isPresent());
        System.out.println("isEmpty(): " + !optionalVehicle.isPresent());

        optionalVehicle.ifPresent(v -> System.out.println("ifPresent(): " + v));

        Vehicle resultOrElse = optionalVehicle.orElse(new Vehicle("Default", 0, 0.0, 0));
        System.out.println("orElse(): " + resultOrElse);

        Vehicle resultOrElseGet = optionalVehicle.orElseGet(() -> new Vehicle("Generated", 10, 1000.0, 2));
        System.out.println("orElseGet(): " + resultOrElseGet);

        try {
            Vehicle resultOrElseThrow = optionalVehicle.orElseThrow(() -> new RuntimeException("Vehicle not found"));
            System.out.println("orElseThrow(): " + resultOrElseThrow);
        } catch (RuntimeException e) {
            System.out.println("orElseThrow(): " + e.getMessage());
        }

        Optional<String> nameOptional = optionalVehicle.map(Vehicle::getName);
        if (nameOptional.isPresent()) {
            System.out.println("map(getName): " + nameOptional.get());
        }

        Optional<Vehicle> filtered = optionalVehicle.filter(v -> v.getSpeed() > 100);
        if (filtered.isPresent()) {
            System.out.println("filter(speed > 100): " + filtered.get());
        }
    }
}
