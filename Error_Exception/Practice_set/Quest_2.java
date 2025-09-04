package Error_Exception.Practice_set;
// Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
import java.util.Scanner;
public class Quest_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A = ");
        int a = sc.nextInt();
        System.out.print("Enter value of A = ");
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("HAHA");
        }
        try {
            // Taking input for IllegalArgumentException
            System.out.print("Enter a priority for thread (1-10 only): ");
            int priority = sc.nextInt();
            Thread t = new Thread();
            t.setPriority(priority); // may throw IllegalArgumentException
            System.out.println("Priority set successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }
}
