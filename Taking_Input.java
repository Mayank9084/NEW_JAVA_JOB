import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.print("The sum of these numbers = ");
        System.out.println(sum);
    }
}
