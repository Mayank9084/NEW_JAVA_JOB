package Advance_Java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Java_Time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
