import java.util.Scanner;
public class Check_int_or_not {
    public static void main(String[] args) {
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
