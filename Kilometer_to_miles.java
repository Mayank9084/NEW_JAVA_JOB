import java.util.Scanner;
public class Kilometer_to_miles {
    public static void main(String[] args) {
        System.out.println(" Convert KILOMETER to MILES ");
        System.out.println();
        System.out.print("write Km = ");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km * 0.62137119;
        System.out.println("Therefore in " + km + " km = " + miles + " miles ");
    }
}
