import java.util.Scanner;
class Pattern_use_method{
    static void pattern(int n){
        for(int i=1; i<=n ;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Pattern Length : ");
        int x = sc.nextInt();
        pattern(x);
    }
}