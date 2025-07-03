import java.util.Scanner;
public class Greater_btw_two {
    public static void main(String[] args) {
        System.out.print("Enter the 1st number u want to compare = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the number u want to compare with 1st = ");
        int b = sc.nextInt();
        System.out.print("1st number is Greater : ");
        System.out.println(a>b);
    }
}
