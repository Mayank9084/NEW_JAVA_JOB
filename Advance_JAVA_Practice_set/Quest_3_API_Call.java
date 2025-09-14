package Advance_java_practise_set;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Quest_3_API_Call{
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);
    }
}