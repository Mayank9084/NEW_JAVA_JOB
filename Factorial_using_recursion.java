import java.util.Scanner;
public class Factorial_using_recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)
    static int factorial_recursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial_recursive(n - 1);
        }
    }

        static int factorial_iterative(int n){
            if ( n==0 || n==1){
                return 1;
            }
            else{
                int product = 1;
                for ( int i = 1; i<=n ; i++) {
                    product *= i;
                }
                return product;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for FACTORIAL : ");
        int x = sc.nextInt();
        System.out.println("FACTORIAL using RECURSIVE is : " + factorial_recursive(x));
        System.out.print("FACTORIAL using ITERATIVE is : " + factorial_iterative(x));
    }
}
