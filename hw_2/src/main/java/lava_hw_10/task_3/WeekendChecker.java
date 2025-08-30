package lava_hw_10.task_3;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class WeekendChecker {
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0)));
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0)));
    }
}