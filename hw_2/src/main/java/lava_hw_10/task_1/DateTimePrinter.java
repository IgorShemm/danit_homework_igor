package lava_hw_10.task_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePrinter {
    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }

    public static void main(String[] args) {
        printCurrentDateTime();
    }
}
