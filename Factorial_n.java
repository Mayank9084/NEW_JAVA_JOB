import java.util.Scanner;
public class Factorial_n{
    public static  void main (String[] args) {
        System.out.print("Write number which you want to find FACTORIAL : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,factorial=1;
        for (i=1;i<=n;i++){
            factorial *= i;
        }
        System.out.println("Factorial of Given number : " + factorial);
    }
}
