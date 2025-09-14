package Advance_java_practise_set;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Quest_2_DateClass {
    public static void main(String[] args) {
//        Question 2: Use the Date class in Java to print the time in the following format : 21:47:02.
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(d));
    }
}
