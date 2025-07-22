import java.util.Scanner;
class Sum_n_num_method{
    static void natural(int n){
        int sum = 0;
        for(int i=1; i<=n ;i++){
            sum = i+sum;
        }
        System.out.print("Sum of number till your given number " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        natural(x);
    }
}