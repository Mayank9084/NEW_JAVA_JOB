package Advance_Java;
import java.util.Calendar;
import java.util.Date;
public class Date_Time {
    public static void main(String[] args) {
      Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        // Setting a custom date using Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(2030, Calendar.JANUARY, 1); // Year, Month (0-based), Day
        Date date = cal.getTime();
        System.out.println(d.after(date));
    }
}
